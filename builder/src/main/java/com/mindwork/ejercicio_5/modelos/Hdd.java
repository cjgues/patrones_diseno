package com.mindwork.ejercicio_5.modelos;

import com.mindwork.ejercicio_5.build.ShowData;

public class Hdd extends InfoBase implements ShowData {
    private final String capacidad;
    private final TipoHdd tipoHdd;

    public Hdd(String marca, String fechaIngreso, String capacidad, TipoHdd tipoHdd) {
        super(marca, fechaIngreso);
        this.capacidad = capacidad;
        this.tipoHdd = tipoHdd;
    }

    @Override
    public void mostrarData() {
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Tipo Hdd: " + tipoHdd);
        System.out.println("Marca: "+ this.getMarca());
    }

    public String getCapacidad() {
        return capacidad;
    }

    public TipoHdd getTipoHdd() {
        return tipoHdd;
    }
}