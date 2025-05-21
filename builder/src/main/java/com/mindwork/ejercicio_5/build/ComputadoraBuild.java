package com.mindwork.ejercicio_5.build;

import com.mindwork.ejercicio_5.exceptions.ComponenteException;
import com.mindwork.ejercicio_5.modelos.*;

public interface ComputadoraBuild {
    ComputadoraBuild setOwner(String owner);
    ComputadoraBuild setCpu(Cpu cpu);
    ComputadoraBuild setGpu(Gpu gpu);
    ComputadoraBuild setHdd(Hdd hdd);
    ComputadoraBuild setRam(Ram ram);
    Computadora build() throws ComponenteException;
}