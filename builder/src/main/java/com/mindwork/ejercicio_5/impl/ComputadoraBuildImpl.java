package com.mindwork.ejercicio_5.impl;

import com.mindwork.ejercicio_5.build.ComputadoraBuild;
import com.mindwork.ejercicio_5.exceptions.ComponenteException;
import com.mindwork.ejercicio_5.modelos.*;

public class ComputadoraBuildImpl implements ComputadoraBuild {
    private String owner;
    private Cpu cpu;
    private Gpu gpu;
    private Hdd hdd;
    private Ram ram;

    @Override
    public ComputadoraBuild setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    @Override
    public ComputadoraBuild setCpu(Cpu cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public ComputadoraBuild setGpu(Gpu gpu) {
        this.gpu = gpu;
        return this;
    }

    @Override
    public ComputadoraBuild setHdd(Hdd hdd) {
        this.hdd = hdd;
        return this;
    }

    @Override
    public ComputadoraBuild setRam(Ram ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public Computadora build() throws ComponenteException {
        return new Computadora(owner, cpu, gpu, hdd, ram);
    }
}
