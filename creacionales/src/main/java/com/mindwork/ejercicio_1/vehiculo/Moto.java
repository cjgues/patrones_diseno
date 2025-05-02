package com.mindwork.ejercicio_1.vehiculo;

public class Moto implements Vehiculo {
    @Override
    public void conducir(String text) {
        System.out.println("Estoy conduciendo una moto de tipo " + text);
    }
}
