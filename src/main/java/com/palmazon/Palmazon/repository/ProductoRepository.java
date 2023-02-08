package com.palmazon.Palmazon.repository;

import com.palmazon.Palmazon.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
