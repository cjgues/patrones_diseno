package com.mindwork.ejercicio_4.modelos;

public class Administrador implements Usuarios {
    @Override
    public void mostrarPermisos(String usuario, String password) {
        System.out.println("Se recibe los daots de usuario " + usuario + " y password " + password);

        if(usuario.equals("admin") && password.equals("TESTING")){
            System.out.println("El usuario tiene permisos de administrador");
        }else{
            System.out.println("El usuario no tiene permisos de administrador");
        }
    }
}
