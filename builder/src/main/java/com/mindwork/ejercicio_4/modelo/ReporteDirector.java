package com.mindwork.ejercicio_4.modelo;

import com.mindwork.ejercicio_4.exception.ReporteInvalidadoException;
import com.mindwork.ejercicio_4.interfaz.ReportBuilder;

import java.time.LocalDate;

public class ReporteDirector {
    private final ReportBuilder reportBuilder;

    public ReporteDirector(ReportBuilder reportBuilder) {
        this.reportBuilder = reportBuilder;
    }

    public Reporte construirReporteResumen(String titulo, String encabezado, String pie, String formato)
            throws ReporteInvalidadoException {
        this.reportBuilder.setTitulo(titulo);
        this.reportBuilder.setEncabezado(encabezado);
        this.reportBuilder.setPie(pie);
        this.reportBuilder.setFormato(formato);
        this.reportBuilder.setFecha(LocalDate.now());
        return this.reportBuilder.build();
    }
}