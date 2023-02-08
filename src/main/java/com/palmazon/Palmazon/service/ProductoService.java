package com.palmazon.Palmazon.service;

import com.palmazon.Palmazon.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    List<Producto> getProductos();

    Optional<Producto> getProductoById(Integer id);

    void setProducto(Producto producto);

    void updateProducto(Integer id, Producto producto);

    void deleteProductoById(Integer id);
}
