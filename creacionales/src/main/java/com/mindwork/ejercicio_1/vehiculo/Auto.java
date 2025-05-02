package com.mindwork.ejercicio_1.vehiculo;

public class Auto implements Vehiculo {
    @Override
    public void conducir(String text) {
        System.out.println("Estoy conduciendo un auto de tipo " + text);
    }
}
