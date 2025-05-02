package com.mindwork.ejercicio_1;

import com.mindwork.ejercicio_1.builder.HamburguesaBuilder;
import com.mindwork.ejercicio_1.modelo.Hamburguesa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        var currentHamburguesa = new HamburguesaBuilder().conPanIntegral().conLechuga().build();
        currentHamburguesa.mostrar();
    }
}
