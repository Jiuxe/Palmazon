package com.palmazon.Palmazon.controller;

import com.palmazon.Palmazon.model.Orden;
import com.palmazon.Palmazon.service.OrdenServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orden")
public class OrdenController {

    @Autowired
    private OrdenServiceImpl ordenService;

    @GetMapping("/all")
    public List<Orden> getOrdenes(){
        return ordenService.getOrdenes();
    }

    @GetMapping("/get/{id}")
    public Optional<Orden> getOrdenById(@PathVariable Integer id){
        return ordenService.getOrdenById(id);
    }

    @PostMapping("/add")
    public void setOrden(@RequestBody Orden orden){
        ordenService.setOrden(orden);
    }

    @PostMapping("/update/{id}")
    public void updateOrden(@PathVariable Integer id, @RequestBody Orden orden){
        ordenService.updateOrden(id, orden);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrdenById(@PathVariable Integer id){
        ordenService.deleteOrdenById(id);
    }

}
