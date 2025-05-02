package com.mindwork.ejercicio_3.modelo;

public class Pdf extends Documento {
    @Override
    public void abrir(String ruta) {
        System.out.println("Abriendo documento PDF de la ruta: " + ruta);
    }
}
