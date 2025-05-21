package com.mindwork.ejercicio_5.modelos;

import com.mindwork.ejercicio_5.build.ShowData;

public class Gpu extends InfoBase implements ShowData {
    private final String memoria;
    private final String voltaje;

    public Gpu(String marca, String fechaIngreso, String memoria, String voltaje) {
        super(marca, fechaIngreso);
        this.memoria = memoria;
        this.voltaje = voltaje;
    }

    public void mostrarData(){
        System.out.println("Memoria: " + this.memoria);
        System.out.println("Voltaje: " + this.voltaje);
        System.out.println("Marca: " + this.getMarca());
    }

    public String getMemoria() {
        return memoria;
    }

    public String getVoltaje() {
        return voltaje;
    }
}