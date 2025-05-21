package com.mindwork.ejercicio_5.modelos;

import com.mindwork.ejercicio_5.exceptions.ComponenteException;

public class Computadora {
    private final String owner;
    private final Cpu cpu;
    private final Gpu gpu;
    private final Hdd hdd;
    private final Ram ram;

    public Computadora(String owner,
                       Cpu cpu,
                       Gpu gpu,
                       Hdd hdd,
                       Ram ram) throws ComponenteException {
        this.owner = owner;
        this.cpu = cpu;
        this.gpu = gpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    public String getOwner() {
        return owner;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public Ram getRam() {
        return ram;
    }
}