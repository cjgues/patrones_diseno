package com.mindwork.ejercicio_5.decorado;

import com.mindwork.ejercicio_5.exceptions.ComponenteException;
import com.mindwork.ejercicio_5.impl.ComputadoraBuildImpl;
import com.mindwork.ejercicio_5.modelos.*;

public class ValidacionComponentes extends ComputadoraBuildImpl {
    public Computadora validarComputadoraGaming(String owner, Cpu cpu, Gpu gpu, Hdd hdd, Ram ram) throws ComponenteException {
        if(gpu == null ||
                (gpu.getMemoria() == null || gpu.getMemoria().isEmpty()) ||
                (gpu.getVoltaje() == null || gpu.getVoltaje().isEmpty())) {
            throw new ComponenteException("Gpu no valido");
        }
        validarComputadora(owner, cpu, hdd, ram);
        validacionBase(gpu.getMarca(), "GPU");

        return this.setCpu(cpu).setGpu(gpu).setHdd(hdd).setRam(ram).setOwner(owner).build();
    }

    public Computadora validarComputadoraBase(String owner, Cpu cpu, Hdd hdd, Ram ram) throws ComponenteException {
        validarComputadora(owner, cpu, hdd, ram);
        return this.setCpu(cpu).setHdd(hdd).setRam(ram).setOwner(owner).build();
    }

    private void validarComputadora(String owner, Cpu cpu, Hdd hdd, Ram ram) throws ComponenteException {
        if(owner == null || owner.isEmpty()) {
            throw new ComponenteException("El owner es obligatorio");
        }

        if(cpu == null ||
                (cpu.getNucleos() == null || cpu.getNucleos().isEmpty()) ||
                (cpu.getVelocidad() == null || cpu.getVelocidad().isEmpty())) {
            throw new ComponenteException("El componente cpu no es valido");
        }
        validacionBase(cpu.getMarca(), "CPU");

        if(hdd == null || hdd.getTipoHdd() == null ||
                (hdd.getCapacidad() == null || hdd.getCapacidad().isEmpty())) {
            throw new ComponenteException("El componente HDD no es valido");
        }
        validacionBase(hdd.getMarca(), "HDD");

        if(ram == null || ram.getTipoRam() == null  ||
                (ram.getCapacidad() == null || ram.getCapacidad().isEmpty())) {
            throw new ComponenteException("El componente RAM no es valido");
        }
        validacionBase(ram.getMarca(), "RAM");
    }

    private void validacionBase(String marca, String componente) throws ComponenteException {
        if(marca == null || marca.isEmpty()) {
            throw new ComponenteException("El "+ componente + " marca no es valido");
        }
    }
}