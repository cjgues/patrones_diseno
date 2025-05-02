package com.mindwork.ejercicio_2.builder;

import com.mindwork.ejercicio_2.modelo.DocumentoPdf;

public class PdfBuilder {
    private boolean titulo;
    private boolean encabezado;
    private boolean cuerpo;
    private boolean tabla;
    private boolean piePagina;

    public DocumentoPdf build() {
        return new DocumentoPdf(this);
    }

    public PdfBuilder titulo() {
        this.titulo = true;
        return this;
    }

    public PdfBuilder encabezado() {
        this.encabezado = true;
        return this;
    }

    public PdfBuilder cuerpo() {
        this.cuerpo = true;
        return this;
    }

    public PdfBuilder tabla() {
        this.tabla = true;
        return this;
    }

    public PdfBuilder piePagina() {
        this.piePagina = true;
        return this;
    }

    public boolean isTitulo() {
        return titulo;
    }

    public boolean isEncabezado() {
        return encabezado;
    }

    public boolean isCuerpo() {
        return cuerpo;
    }

    public boolean isTabla() {
        return tabla;
    }

    public boolean isPiePagina() {
        return piePagina;
    }
}