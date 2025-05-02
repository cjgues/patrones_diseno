package com.mindwork.ejercicio_1.factory;

import com.mindwork.ejercicio_1.vehiculo.Auto;
import com.mindwork.ejercicio_1.vehiculo.Vehiculo;

public class AutoVehiculo extends VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo() {
        return new Auto();
    }
}
