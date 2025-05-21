package com.mindwork.ejercicio_4.impl;

import com.mindwork.ejercicio_4.exception.ReporteInvalidadoException;
import com.mindwork.ejercicio_4.interfaz.ReportBuilder;
import com.mindwork.ejercicio_4.modelo.Reporte;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReportBuildImpl implements ReportBuilder {
    private String titulo;
    private String fecha;
    private String encabezado;
    private List<String> cuerpo;
    private String pie;
    private String formato;

    @Override
    public ReportBuilder setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    @Override
    public ReportBuilder setFecha(LocalDate fecha) {
        this.fecha = fecha.toString();
        return this;
    }

    @Override
    public ReportBuilder setEncabezado(String encabezado) {
        this.encabezado = encabezado;
        return this;
    }

    @Override
    public ReportBuilder agregarLineaCuerpo(String linea) {
        if(cuerpo == null) {
            cuerpo = new ArrayList<>();
        }
        this.cuerpo.add(linea);
        return this;
    }

    @Override
    public ReportBuilder setPie(String pie) {
        this.pie = pie;
        return this;
    }

    @Override
    public ReportBuilder setFormato(String formato) {
        this.formato = formato;
        return this;
    }

    @Override
    public Reporte build() throws ReporteInvalidadoException {
        return new Reporte(
                this.titulo,
                this.fecha,
                this.encabezado,
                this.cuerpo,
                this.pie,
                this.formato);
    }
}
