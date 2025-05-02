package com.mindwork.ejercicio_2;

import com.mindwork.ejercicio_2.builder.PdfBuilder;
import com.mindwork.ejercicio_2.decorado.ValidatePdfDocument;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2");

        var pdfBuilder = new PdfBuilder()
                .setTitulo("Esto es una prueba")
                .setEncabezado("Esto es una prueba")
                .setCuerpo("Contenido de prueba")
                .setTabla(null)
                .setPiePagina(null);

        try{
            var documentoPdf = new ValidatePdfDocument(pdfBuilder).build();
            System.out.println("Informacion recibida para el documento");

            if (!documentoPdf.getTitulo().isEmpty()) System.out.println("Titulo: " + documentoPdf.getTitulo());
            if (!documentoPdf.getEncabezado().isEmpty())System.out.println("Encabezado: " + documentoPdf.getEncabezado());
            if (!documentoPdf.getCuerpo().isEmpty()) System.out.println("Cuerpo: " + documentoPdf.getCuerpo());
            if (!documentoPdf.getTabla().isEmpty()) System.out.println("Tabla: " + documentoPdf.getTabla());
            if (!documentoPdf.getPiePagina().isEmpty()) System.out.println("Pie de pagina: " + documentoPdf.getPiePagina());
        }catch (Exception e){
            System.out.println("Error al crear el documento PDF: " + e.getMessage());
        }
    }
}