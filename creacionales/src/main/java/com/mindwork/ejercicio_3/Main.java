package com.mindwork.ejercicio_3;

import com.mindwork.ejercicio_3.factory.EditorDocumento;
import com.mindwork.ejercicio_3.modelo.TipoDocumento;

public class Main {
    public static EditorDocumento editorDocumento;

    public static void main(String[] args) {
        System.out.println("Ejercicio 3");
        editorDocumento = new EditorDocumento();

        abrirDocumento(TipoDocumento.WORD, "aca va la ruta del WORD");
        System.out.println("=============================");
        abrirDocumento(TipoDocumento.PDF, "aca va la ruta del PDF");
        System.out.println("=============================");
        abrirDocumento(TipoDocumento.EXCEL, "aca va la ruta del EXCEL");
        System.out.println("=============================");
    }

    public static void abrirDocumento(TipoDocumento tipoDocumento, String path){
        var currentDocumento = editorDocumento.crearDocumento(tipoDocumento);
        currentDocumento.abrir(path);
    }
}
