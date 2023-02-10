package com.palmazon.Palmazon.service;

import com.palmazon.Palmazon.model.DetalleOrden;
import com.palmazon.Palmazon.repository.DetalleOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class DetalleOrdenServiceImpl implements DetalleOrdenService {

    @Autowired
    DetalleOrdenRepository detalleOrdenRepository;

    @Override
    public Optional<DetalleOrden> getDetalleOrdenById(Integer id){
        return detalleOrdenRepository.findById(id);
    }

    @Override
    public void setDetalleOrden(DetalleOrden detalle_orden){
        detalleOrdenRepository.save(detalle_orden);
    }
    @Override
    public void updateDetalleOrden(Integer id, DetalleOrden detalle_orden){

        try {
            DetalleOrden old_detalle_orden = getDetalleOrdenById(id).orElseThrow(() -> new IllegalArgumentException("Value is not present"));
            if(!old_detalle_orden.equals(detalle_orden)){
                old_detalle_orden.setNombre(detalle_orden.getNombre());
                old_detalle_orden.setCantidad(detalle_orden.getCantidad());
                old_detalle_orden.setPrecio(detalle_orden.getPrecio());
                old_detalle_orden.setTotal(detalle_orden.getTotal());
                old_detalle_orden.setOrden(detalle_orden.getOrden());
                old_detalle_orden.setProducto(detalle_orden.getProducto());
                detalleOrdenRepository.save(old_detalle_orden);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteDetalleOrdenById(Integer id){
        detalleOrdenRepository.deleteById(id);
    }
}
