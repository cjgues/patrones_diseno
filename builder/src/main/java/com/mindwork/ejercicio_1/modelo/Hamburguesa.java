package com.mindwork.ejercicio_1.modelo;

import com.mindwork.ejercicio_1.builder.HamburguesaBuilder;

public class Hamburguesa {
    private final boolean panIntegral;
    private final boolean queso;
    private final boolean tocino;
    private final boolean lechuga;
    private final boolean tomate;

    public Hamburguesa(HamburguesaBuilder builder) {
        this.panIntegral = builder.isPanIntegral();
        this.queso = builder.isQueso();
        this.tocino = builder.isTocino();
        this.lechuga = builder.isLechuga();
        this.tomate = builder.isTomate();
    }

    public void mostrar() {
        System.out.println("Hamburguesa personalizada:");
        if (panIntegral) System.out.println("- Pan integral");
        if (queso) System.out.println("- Queso");
        if (tocino) System.out.println("- Tocino");
        if (lechuga) System.out.println("- Lechuga");
        if (tomate) System.out.println("- Tomate");
        if (!panIntegral && !queso && !tocino && !lechuga && !tomate)
            System.out.println("- Hamburguesa básica");
    }
}