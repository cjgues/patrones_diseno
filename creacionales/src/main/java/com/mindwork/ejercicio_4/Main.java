package com.mindwork.ejercicio_4;

import com.mindwork.ejercicio_4.factory.UsuarioFactory;
import com.mindwork.ejercicio_4.modelos.Rol;

public class Main {
    public static UsuarioFactory usuarioFactory;

    public static void main(String[] args) {
        System.out.println("Ejercicio 4");

        usuarioFactory = new UsuarioFactory();
        validarCredenciales(Rol.ADMIN, "admin", "TESTING");
        System.out.println("=============================");
        validarCredenciales(Rol.EDITOR, "editor", "admin");
        System.out.println("=============================");
        validarCredenciales(Rol.LECTOR, "lector", "TESTING");
        System.out.println("=============================");
    }

    private static void validarCredenciales(Rol rol, String usuario, String password){
        var currentUsuario = usuarioFactory.crearUsuario(rol);
        currentUsuario.mostrarPermisos(usuario, password);
    }
}
