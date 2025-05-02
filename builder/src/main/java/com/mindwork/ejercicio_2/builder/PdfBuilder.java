package com.mindwork.ejercicio_2.builder;

import com.mindwork.ejercicio_2.modelo.DocumentoPdf;

public class PdfBuilder {
    private String titulo;
    private String encabezado;
    private String  cuerpo;
    private String tabla;
    private String piePagina;

    public DocumentoPdf build() {
        return new DocumentoPdf(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public PdfBuilder setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getEncabezado() {
        return encabezado;
    }

    public PdfBuilder setEncabezado(String encabezado) {
        this.encabezado = encabezado;
        return this;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public PdfBuilder setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
        return this;
    }

    public String getTabla() {
        return tabla;
    }

    public PdfBuilder setTabla(String tabla) {
        this.tabla = tabla;
        return this;
    }

    public String getPiePagina() {
        return piePagina;
    }

    public PdfBuilder setPiePagina(String piePagina) {
        this.piePagina = piePagina;
        return this;
    }
}