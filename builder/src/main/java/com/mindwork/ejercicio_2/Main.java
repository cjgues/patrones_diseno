package com.mindwork.ejercicio_2;

import com.mindwork.ejercicio_2.builder.PdfBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2");

        var documentoPdf = new PdfBuilder().cuerpo().encabezado().titulo().build();
        documentoPdf.mostrarDocumento();
    }
}