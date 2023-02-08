package com.palmazon.Palmazon.service;

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
        Producto old_user = getProductoById(id).orElseThrow();

        productoRepository.save(old_user);
    }

    @Override
    public void deleteProductoById(Integer id){
        productoRepository.deleteById(id);
    }
}
