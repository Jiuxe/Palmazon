package com.palmazon.Palmazon.service;

import com.palmazon.Palmazon.model.DetalleOrden;
import com.palmazon.Palmazon.model.Orden;
import com.palmazon.Palmazon.repository.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdenServiceImpl implements OrdenService {

    @Autowired
    OrdenRepository ordenRepository;

    @Override
    public List<Orden> getOrdenes(){
        return ordenRepository.findAll();
    }

    @Override
    public Optional<Orden> getOrdenById(Integer id){
        return ordenRepository.findById(id);
    }

    @Override
    public void setOrden(Orden orden){
        ordenRepository.save(orden);
    }
    @Override
    public void updateOrden(Integer id, Orden orden){

        try {
            Orden old_orden = getOrdenById(id).orElseThrow(() -> new IllegalArgumentException("Value is not present"));
            if(!old_orden.equals(orden)){
                old_orden.setNumero(orden.getNumero());
                old_orden.setFechaCreacion(orden.getFechaCreacion());
                old_orden.setFechaRecibida(orden.getFechaRecibida());
                old_orden.setTotal(orden.getTotal());
                old_orden.setUsuario(orden.getUsuario());
                old_orden.setDetalle(orden.getDetalle());
                ordenRepository.save(old_orden);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteOrdenById(Integer id){
        ordenRepository.deleteById(id);
    }
}
