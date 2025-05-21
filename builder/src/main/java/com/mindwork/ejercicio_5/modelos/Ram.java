package com.mindwork.ejercicio_5.modelos;

import com.mindwork.ejercicio_5.build.ShowData;

public class Ram extends InfoBase implements ShowData {
    private final String capacidad;
    private final TipoRam tipoRam;

    public Ram(String marca, String fechaIngreso, String capacidad, TipoRam tipoRam) {
        super(marca, fechaIngreso);
        this.capacidad = capacidad;
        this.tipoRam = tipoRam;
    }

    @Override
    public void mostrarData() {
        System.out.println("Capacidad: " + this.capacidad);
        System.out.println("Tipo Ram: " + this.tipoRam);
        System.out.println("Marca: " + this.getMarca());
    }

    public String getCapacidad() {
        return capacidad;
    }

    public TipoRam getTipoRam() {
        return tipoRam;
    }
}