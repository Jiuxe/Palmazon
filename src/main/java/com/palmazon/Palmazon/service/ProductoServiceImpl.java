package com.palmazon.Palmazon.service;

import com.palmazon.Palmazon.model.Orden;
import com.palmazon.Palmazon.model.Producto;
import com.palmazon.Palmazon.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public List<Producto> getProductos(){
        return productoRepository.findAll();
    }

    @Override

    public Optional<Producto> getProductoById(Integer id){
        return productoRepository.findById(id);
    }

    @Override
    public void setProducto(Producto producto){
        productoRepository.save(producto);
    }
    @Override
    public void updateProducto(Integer id, Producto producto){

        try {
            Producto old_product = getProductoById(id).orElseThrow(() -> new IllegalArgumentException("Value is not present"));
            if(!old_product.equals(producto)){
                old_product.setNombre(producto.getNombre());
                old_product.setDescripcion(producto.getDescripcion());
                old_product.setImagen(producto.getImagen());
                old_product.setPrecio(producto.getPrecio());
                old_product.setCantidad(producto.getCantidad());
                old_product.setUsuario(producto.getUsuario());
                productoRepository.save(old_product);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteProductoById(Integer id){
        productoRepository.deleteById(id);
    }
}
