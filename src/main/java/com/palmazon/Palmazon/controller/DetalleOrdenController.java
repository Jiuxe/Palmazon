package com.palmazon.Palmazon.controller;

import com.palmazon.Palmazon.model.DetalleOrden;
import com.palmazon.Palmazon.service.DetalleOrdenServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/detalle-orden")
public class DetalleOrdenController {

    @Autowired
    private DetalleOrdenServiceImpl detalleOrdenService;

    @GetMapping("/get/{id}")
    public Optional<DetalleOrden> getDetalleOrdenById(@PathVariable Integer id){
        return detalleOrdenService.getDetalleOrdenById(id);
    }

    @PostMapping("/add")
    public void setOrden(@RequestBody DetalleOrden detalle_orden){
        detalleOrdenService.setDetalleOrden(detalle_orden);
    }

    @PostMapping("/update/{id}")
    public void updateDetalleOrden(@PathVariable Integer id, @RequestBody DetalleOrden detalle_orden){
        detalleOrdenService.updateDetalleOrden(id, detalle_orden);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDetalleOrdenById(@PathVariable Integer id){
        detalleOrdenService.deleteDetalleOrdenById(id);
    }

}
