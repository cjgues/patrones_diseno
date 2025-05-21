package com.mindwork.ejercicio_4;

import com.mindwork.ejercicio_4.decorado.ValidacionReporte;
import com.mindwork.ejercicio_4.impl.ReportBuildImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4\n");
        var reportBuild = new ReportBuildImpl();
        var director = new ValidacionReporte(reportBuild);

        try{
            var repote = director.construirReporteResumen("Titulo builder", "Datos de encabezado",
                    "Seccion de pie", "HTML");
            System.out.println("=== Reporte Resumen ===");
            System.out.println("Título: " + repote.getTitulo());
            System.out.println("Encabezado: " + repote.getEncabezado());
            System.out.println("Pie: " + repote.getPie());
            System.out.println("Formato: " + repote.getFormato());

            System.out.println("==================");

            var reporteDetallado = director.construirReporteDetallado("Titulo builder detallado",
                    "Dato encabezado detallado", "Pied con detalle", "HTML",
                    "Linea 1", "Linea 2", "Linea 3", "Linea 4", "Linea 5", "Linea 6");
            System.out.println("=== Reporte Resumen Detallado ===");
            System.out.println("Título: " + reporteDetallado.getTitulo());
            System.out.println("Encabezado: " + reporteDetallado.getEncabezado());

            for (int i=0; i<reporteDetallado.getCuerpo().size(); i++){
                System.out.println("Cuerpo:" + reporteDetallado.getCuerpo().get(i));
            }

            System.out.println("Pie: " + reporteDetallado.getPie());
            System.out.println("Formato: " + reporteDetallado.getFormato());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}