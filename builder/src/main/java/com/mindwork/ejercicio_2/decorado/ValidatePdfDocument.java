package com.mindwork.ejercicio_2.decorado;

import com.mindwork.ejercicio_2.builder.PdfBuilder;
import com.mindwork.ejercicio_2.modelo.DocumentoPdf;

public class ValidatePdfDocument extends PdfBuilder {
    private final PdfBuilder builder;

    public ValidatePdfDocument(PdfBuilder builder) {
        this.builder = builder;
    }

    @Override
    public PdfBuilder setTitulo(String titulo) {
        return super.setTitulo(titulo);
    }

    @Override
    public DocumentoPdf build() throws IllegalArgumentException {
        if(builder.getTitulo() == null || builder.getTitulo().isEmpty()){
            throw new IllegalArgumentException("El titulo no puede ser nulo ni vacio");
        }

        if(builder.getEncabezado() == null || builder.getEncabezado().isEmpty()){
            throw new IllegalArgumentException("El encabezado no puede ser nulo ni vacio");
        }

        if(builder.getCuerpo() == null || builder.getCuerpo().isEmpty()){
            throw new IllegalArgumentException("El cuerpo no puede ser nulo ni vacio");
        }

        if(builder.getPiePagina() == null){
            builder.setPiePagina("Pagina 1");
        }

        if(builder.getTabla() == null){
            builder.setTabla("");
        }

        return builder.build();
    }

    @Override
    public PdfBuilder setEncabezado(String encabezado) {
        return super.setEncabezado(encabezado);
    }

    @Override
    public PdfBuilder setCuerpo(String cuerpo) {
        return super.setCuerpo(cuerpo);
    }

    @Override
    public PdfBuilder setTabla(String tabla) {
        return super.setTabla(tabla);
    }

    @Override
    public PdfBuilder setPiePagina(String piePagina) {
        return super.setPiePagina(piePagina);
    }
}