package com.mindwork.ejercicio_3.modelo;

public class Word extends Documento {
    @Override
    public void abrir(String ruta) {
        System.out.println("Abriendo documento Word de la ruta: " + ruta);
    }
}
