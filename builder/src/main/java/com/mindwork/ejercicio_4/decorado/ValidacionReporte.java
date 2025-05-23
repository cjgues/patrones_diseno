package com.mindwork.ejercicio_4.decorado;

import com.mindwork.ejercicio_4.exception.ReporteInvalidadoException;
import com.mindwork.ejercicio_4.interfaz.ReportBuilder;
import com.mindwork.ejercicio_4.modelo.Reporte;
import com.mindwork.ejercicio_4.modelo.ReporteDirector;

public class ValidacionReporte extends ReporteDirector {

    public ValidacionReporte(ReportBuilder reportBuilder) {
        super(reportBuilder);
    }

    @Override
    public Reporte construirReporteResumen(String titulo, String encabezado, String pie, String formato) throws ReporteInvalidadoException {
        validacionBasica(titulo, encabezado, pie, formato);
        return super.construirReporteResumen(titulo, encabezado, pie, formato);
    }

    @Override
    public Reporte construirReporteDetallado(String titulo, String encabezado, String pie, String formato, String ... lineas) throws ReporteInvalidadoException {
        validacionBasica(titulo, encabezado, pie, formato);

        if(lineas.length == 0){
            throw new ReporteInvalidadoException("No se puede detallar los lineas");
        }

        return super.construirReporteDetallado(titulo, encabezado, pie, formato, lineas);
    }

    private void validacionBasica(String titulo, String encabezado, String pie, String formato){
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El titulo no puede ser nulo");
        }

        if (encabezado == null || encabezado.trim().isEmpty()) {
            throw new IllegalArgumentException("El encabezado no puede ser nulo");
        }

        if (pie == null || pie.trim().isEmpty()) {
            throw new IllegalArgumentException("El pie no puede ser nulo");
        }

        if (formato == null || formato.trim().isEmpty()) {
            throw new IllegalArgumentException("El formato no puede ser nulo");
        }
    }
}