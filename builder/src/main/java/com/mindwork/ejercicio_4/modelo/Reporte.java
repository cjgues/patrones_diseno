package com.mindwork.ejercicio_4.modelo;

import java.util.List;

public class Reporte {
    private final String titulo;
    private final String fecha;
    private final String encabezado;
    private final List<String> cuerpo;
    private final String pie;
    private final String formato;

    public Reporte(String titulo,
                   String fecha,
                   String encabezado,
                   List<String> cuerpo,
                   String pie,
                   String formato) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.encabezado = encabezado;
        this.cuerpo = cuerpo;
        this.pie = pie;
        this.formato = formato;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEncabezado() {
        return encabezado;
    }

    public List<String> getCuerpo() {
        return cuerpo;
    }

    public String getPie() {
        return pie;
    }

    public String getFormato() {
        return formato;
    }
}