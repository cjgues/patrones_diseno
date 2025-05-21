package com.mindwork.ejercicio_5;

import com.mindwork.ejercicio_5.decorado.ValidacionComponentes;
import com.mindwork.ejercicio_5.modelos.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 5");

        var validacionComponentes = new ValidacionComponentes();
        try{
            var computadoraGaming = validacionComponentes.validarComputadoraGaming(
                    "Cristhian cjgues",
                    new Cpu("prueba", LocalDate.now().toString(), "100", "12"),
                    new Gpu("prueba gpu", LocalDate.now().toString(), "4gb", "120"),
                    new Hdd("prueba hdd", null, "120GB", TipoHdd.HDD),
                    new Ram("Prueba de ram", null, "32 GB", TipoRam.DDR5));
            System.out.println("Computadora gaming de " + computadoraGaming.getOwner());
            System.out.println("Con informacion de CPU");
            computadoraGaming.getCpu().mostrarData();
            System.out.println("===========================");
            System.out.println("Con informacion de GPU");
            computadoraGaming.getGpu().mostrarData();
            System.out.println("===========================");
            System.out.println("Con informacion de HDD");
            computadoraGaming.getHdd().mostrarData();
            System.out.println("===========================");
            System.out.println("Con informacion de RAM");
            computadoraGaming.getRam().mostrarData();
            System.out.println("===========================");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}