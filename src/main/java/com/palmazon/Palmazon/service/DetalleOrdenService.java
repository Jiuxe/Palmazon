package com.palmazon.Palmazon.service;

import com.palmazon.Palmazon.model.DetalleOrden;
import java.util.Optional;

public interface DetalleOrdenService {


    Optional<DetalleOrden> getDetalleOrdenById(Integer id);

    void setDetalleOrden(DetalleOrden detalle_orden);

    void updateDetalleOrden(Integer id, DetalleOrden detalle_orden);

    void deleteDetalleOrdenById(Integer id);
}
