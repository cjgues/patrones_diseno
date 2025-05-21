package com.mindwork.ejercicio_3;

import com.mindwork.ejercicio_3.builder.ComputadoraBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Ejercicio 3\n");
        var computadora = new ComputadoraBuilder()
                .setCpu("Intel")
                .setHdd("120 GB")
                .setSO("Windows 10")
                .setRam("32GB")
                .build();

        if (computadora.getSO() != null && !computadora.getSO().isEmpty()) System.out.printf("Computadora so: %s\n", computadora.getSO());
        if (computadora.getCpu() != null && !computadora.getCpu().isEmpty()) System.out.printf("Computadora cpu: %s\n", computadora.getCpu());
        if (computadora.getHdd() != null && !computadora.getHdd().isEmpty()) System.out.printf("Computadora hdd: %s\n", computadora.getHdd());
        if (computadora.getRam() != null && !computadora.getRam().isEmpty()) System.out.printf("Computadora RAM: %s\n", computadora.getRam());
        if (computadora.getGpu() != null && !computadora.getGpu().isEmpty()) System.out.printf("Computadora GPU: %s\n", computadora.getGpu());
    }
}