package com.mindwork.ejercicio_1.factory;

import com.mindwork.ejercicio_1.vehiculo.Camion;
import com.mindwork.ejercicio_1.vehiculo.Vehiculo;

public class CamionVehiculo extends VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo() {
        return new Camion();
    }
}
