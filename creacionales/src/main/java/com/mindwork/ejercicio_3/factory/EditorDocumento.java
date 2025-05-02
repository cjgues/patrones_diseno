package com.mindwork.ejercicio_3.factory;

import com.mindwork.ejercicio_3.modelo.*;

public class EditorDocumento {
    public Documento crearDocumento(TipoDocumento tipoDocumento) {
        return switch (tipoDocumento){
            case PDF -> new Pdf();
            case EXCEL -> new Excel();
            case WORD -> new Word();

        };
    }
}