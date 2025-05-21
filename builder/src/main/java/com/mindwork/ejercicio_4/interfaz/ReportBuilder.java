package com.mindwork.ejercicio_4.interfaz;

import com.mindwork.ejercicio_4.exception.ReporteInvalidadoException;
import com.mindwork.ejercicio_4.modelo.Reporte;

import java.time.LocalDate;

public interface ReportBuilder {
    ReportBuilder setTitulo(String titulo);
    ReportBuilder setFecha(LocalDate fecha);
    ReportBuilder setEncabezado(String encabezado);
    ReportBuilder agregarLineaCuerpo(String linea);
    ReportBuilder setPie(String pie);
    ReportBuilder setFormato(String formato);
    Reporte build() throws ReporteInvalidadoException;
}