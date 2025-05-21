package com.mindwork.ejercicio_5.modelos;

public class InfoBase {
    private String marca;
    private String fechaIngreso;

    public InfoBase(String marca, String fechaIngreso) {
        this.marca = marca;
        this.fechaIngreso = fechaIngreso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}