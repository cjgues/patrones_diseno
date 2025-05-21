package com.mindwork.ejercicio_4;

import com.mindwork.ejercicio_4.decorado.ValidacionReporte;
import com.mindwork.ejercicio_4.impl.ReportBuildImpl;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Ejercicio 4\n");
        var reportBuild = new ReportBuildImpl();
        var director = new ValidacionReporte(reportBuild);

        try{
            var repote = director.construirReporteResumen("Titulo builder", "Datos de encabezado",
                    "Seccion de pie", "HTML");
            System.out.println("=== Reporte ===");
            System.out.println("Título: " + repote.getTitulo());
            System.out.println("Encabezado: " + repote.getEncabezado());
            System.out.println("Pie: " + repote.getPie());
            System.out.println("Formato: " + repote.getFormato());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}