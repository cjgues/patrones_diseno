package com.mindwork.ejercicio_1.factory;

import com.mindwork.ejercicio_1.vehiculo.Moto;
import com.mindwork.ejercicio_1.vehiculo.Vehiculo;

public class MotoVehiculo extends VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo() {
        return new Moto();
    }
}
