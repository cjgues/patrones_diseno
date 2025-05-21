package com.mindwork.ejercicio_3.builder;

import com.mindwork.ejercicio_3.modelo.Computadora;

public class ComputadoraBuilder {
    private String ram;
    private String cpu;
    private String gpu;
    private String hdd;
    private String SO;

    public Computadora build() {
        return new Computadora(this);
    }

    public ComputadoraBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public ComputadoraBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputadoraBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public ComputadoraBuilder setHdd(String hdd) {
        this.hdd = hdd;
        return this;
    }

    public ComputadoraBuilder setSO(String SO) {
        this.SO = SO;
        return this;
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