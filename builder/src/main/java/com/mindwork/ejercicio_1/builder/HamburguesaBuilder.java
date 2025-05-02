package com.mindwork.ejercicio_1.builder;

import com.mindwork.ejercicio_1.modelo.Hamburguesa;

public class HamburguesaBuilder {
    private boolean panIntegral;
    private boolean queso;
    private boolean tocino;
    private boolean lechuga;
    private boolean tomate;

    public HamburguesaBuilder conPanIntegral() {
        this.panIntegral = true;
        return this;
    }

    public HamburguesaBuilder conQueso() {
        this.queso = true;
        return this;
    }

    public HamburguesaBuilder conTocino() {
        this.tocino = true;
        return this;
    }

    public HamburguesaBuilder conLechuga() {
        this.lechuga = true;
        return this;
    }

    public HamburguesaBuilder conTomate() {
        this.tomate = true;
        return this;
    }

    public boolean isPanIntegral() {
        return panIntegral;
    }

    public boolean isQueso() {
        return queso;
    }

    public boolean isTocino() {
        return tocino;
    }

    public boolean isLechuga() {
        return lechuga;
    }

    public boolean isTomate() {
        return tomate;
    }

    public Hamburguesa build() {
        return new Hamburguesa(this);
    }
}