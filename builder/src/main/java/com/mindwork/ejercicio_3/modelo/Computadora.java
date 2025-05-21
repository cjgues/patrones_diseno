package com.mindwork.ejercicio_3.modelo;

import com.mindwork.ejercicio_3.builder.ComputadoraBuilder;

public class Computadora {
    private final String ram;
    private final String cpu;
    private final String gpu;
    private final String hdd;
    private final String SO;

    public Computadora(ComputadoraBuilder builder) {
        this.ram = builder.getRam();
        this.cpu = builder.getCpu();
        this.gpu = builder.getGpu();
        this.hdd = builder.getHdd();
        this.SO = builder.getSO();
    }

    public String getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public String getHdd() {
        return hdd;
    }

    public String getSO() {
        return SO;
    }
}