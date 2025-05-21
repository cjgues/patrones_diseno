package com.mindwork.ejercicio_4;

import com.mindwork.ejercicio_4.impl.ReportBuildImpl;
import com.mindwork.ejercicio_4.modelo.ReporteDirector;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Ejercicio 4\n");
        var reportBuilder = new ReportBuildImpl()
                .setTitulo("Ejercicio 4")
                .setFecha(LocalDate.now())
                .setEncabezado("Esto es una prueba de encabezado")
                .agregarLineaCuerpo("Linea 1")
                .agregarLineaCuerpo("Linea 2")
                .agregarLineaCuerpo("Linea 3")
                .agregarLineaCuerpo("Linea 4")
                .setPie("Esto es un pie de pagina")
                .setFormato("PDF");

        var reporte = new ReporteDirector().crearReporteReumen(reportBuilder);

    }
}