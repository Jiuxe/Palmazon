package com.palmazon.Palmazon.service;

import com.palmazon.Palmazon.model.Orden;
import java.util.List;
import java.util.Optional;

public interface OrdenService {

    List<Orden> getOrdenes();

    Optional<Orden> getOrdenById(Integer id);

    void setOrden(Orden orden);

    void updateOrden(Integer id, Orden orden);

    void deleteOrdenById(Integer id);
}
