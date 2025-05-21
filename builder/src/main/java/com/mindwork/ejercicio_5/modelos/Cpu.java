package com.mindwork.ejercicio_5.modelos;

import com.mindwork.ejercicio_5.build.ShowData;

public class Cpu extends InfoBase implements ShowData {
    private final String velocidad;
    private final String nucleos;

    public Cpu(String marca, String fechaIngreso, String velocidad, String nucleos) {
        super(marca, fechaIngreso);
        this.velocidad = velocidad;
        this.nucleos = nucleos;
    }

    @Override
    public void mostrarData() {
        System.out.println("Velocidad: " + this.velocidad);
        System.out.println("Nucleos: " + this.nucleos);
        System.out.println("Marca: " + this.getMarca());
    }

    public String getVelocidad() {
        return velocidad;
    }

    public String getNucleos() {
        return nucleos;
    }
}