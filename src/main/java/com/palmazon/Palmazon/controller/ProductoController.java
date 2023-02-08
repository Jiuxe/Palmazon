package com.palmazon.Palmazon.controller;

import com.palmazon.Palmazon.model.Producto;
import com.palmazon.Palmazon.service.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoServiceImpl productoService;

    @GetMapping("/all")
    public List<Producto> getProductos(){
        return productoService.getProductos();
    }

    @GetMapping("/get/{id}")
    public Optional<Producto> getProductoById(@PathVariable Integer id){
        return productoService.getProductoById(id);
    }

    @PostMapping("/add")
    public void setProducto(@RequestBody Producto producto){
        productoService.setProducto(producto);
    }

    @PostMapping("/update/{id}")
    public void updateProducto(@PathVariable Integer id, @RequestBody Producto producto){
        productoService.updateProducto(id, producto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProductoById(@PathVariable Integer id){
        productoService.deleteProductoById(id);
    }

}
