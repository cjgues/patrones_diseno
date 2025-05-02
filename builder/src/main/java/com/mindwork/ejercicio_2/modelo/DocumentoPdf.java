package com.mindwork.ejercicio_2.modelo;

import com.mindwork.ejercicio_2.builder.PdfBuilder;

public class DocumentoPdf {
    private String titulo;
    private String encabezado;
    private String cuerpo;
    private String tabla;
    private String piePagina;

    public DocumentoPdf(PdfBuilder builder) {
        this.titulo = builder.isTitulo()? "Titulo generico":"";
        this.encabezado = builder.isEncabezado()? "Encabezado generico":"";
        this.cuerpo = builder.isCuerpo()? "Cuerpo generico":"";
        this.tabla = builder.isTabla()? "Tabla generica":"";
        this.piePagina = builder.isPiePagina()? "Pie de pagina generico":"";
    }

    public void mostrarDocumento(){
        System.out.println("Informacion recibida para el documento");

        if (!titulo.isEmpty()) System.out.println("Titulo: " + titulo);
        if (!encabezado.isEmpty())System.out.println("Encabezado: " + encabezado);
        if (!cuerpo.isEmpty()) System.out.println("Cuerpo: " + cuerpo);
        if (!tabla.isEmpty()) System.out.println("Tabla: " + tabla);
        if (!piePagina.isEmpty()) System.out.println("Pie de pagina: " + piePagina);
    }
}