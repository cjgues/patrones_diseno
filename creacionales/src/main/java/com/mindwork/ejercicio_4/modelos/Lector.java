package com.mindwork.ejercicio_4.modelos;

public class Lector implements Usuarios {
    @Override
    public void mostrarPermisos(String usuario, String password) {
        System.out.println("Se recibe los daots de usuario " + usuario + " y password " + password);

        if(usuario.equals("lector") && password.equals("TESTING")){
            System.out.println("El usuario tiene permisos de lector");
        }else{
            System.out.println("El usuario no tiene permisos de lector");
        }
    }
}
