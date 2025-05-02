package com.mindwork.ejercicio_1.vehiculo;

public class Camion implements Vehiculo {
    @Override
    public void conducir(String text) {
        System.out.println("Estoy conduciendo un camion de tipo " + text);
    }
}
