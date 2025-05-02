package com.mindwork.ejercicio_2.modelo;

import com.mindwork.ejercicio_2.builder.PdfBuilder;

public class DocumentoPdf {
    private final String titulo;
    private final String encabezado;
    private final String cuerpo;
    private final String tabla;
    private final String piePagina;

    public DocumentoPdf(PdfBuilder builder) {
        this.titulo = builder.getTitulo();
        this.encabezado = builder.getEncabezado();
        this.cuerpo = builder.getCuerpo();
        this.tabla = builder.getTabla();
        this.piePagina = builder.getPiePagina();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEncabezado() {
        return encabezado;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public String getTabla() {
        return tabla;
    }

    public String getPiePagina() {
        return piePagina;
    }
}