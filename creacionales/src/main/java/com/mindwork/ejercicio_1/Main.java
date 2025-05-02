package com.mindwork.ejercicio_1;

import com.mindwork.ejercicio_1.factory.AutoVehiculo;
import com.mindwork.ejercicio_1.factory.CamionVehiculo;
import com.mindwork.ejercicio_1.factory.MotoVehiculo;
import com.mindwork.ejercicio_1.factory.VehiculoFactory;
import com.mindwork.ejercicio_1.vehiculo.Vehiculo;

public class Main {
    public static VehiculoFactory vehiculoFactory;

    public static void main(String[] args) {
        System.out.println("Comenzamos a crear vehiculos");
        vehiculoFactory = new AutoVehiculo();
        Vehiculo currentVehiculo;
        currentVehiculo = vehiculoFactory.crearVehiculo();
        currentVehiculo.conducir("Sedan");

        vehiculoFactory = new CamionVehiculo ();
        currentVehiculo = vehiculoFactory.crearVehiculo();
        currentVehiculo.conducir("3 Toneladas");

        vehiculoFactory = new MotoVehiculo();
        currentVehiculo = vehiculoFactory.crearVehiculo();
        currentVehiculo.conducir("Chopper");
    }
}
