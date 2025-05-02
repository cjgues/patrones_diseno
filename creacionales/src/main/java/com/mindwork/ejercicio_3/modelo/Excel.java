package com.mindwork.ejercicio_3.modelo;

public class Excel extends Documento {
    @Override
    public void abrir(String ruta) {
        System.out.println("Abriendo documento EXCEL de la ruta: " + ruta);
    }
}
