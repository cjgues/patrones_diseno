package com.mindwork.ejercicio_4.modelo;

import com.mindwork.ejercicio_4.exception.ReporteInvalidadoException;
import com.mindwork.ejercicio_4.interfaz.ReportBuilder;

public class ReporteDirector {
    public Reporte crearReporteReumen(ReportBuilder reportBuilder) throws ReporteInvalidadoException {
        return reportBuilder.build();
    }

    public Reporte crearReporteDetallado(ReportBuilder reportBuilder) throws ReporteInvalidadoException {
        return reportBuilder.build();
    }
}