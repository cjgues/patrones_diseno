package com.mindwork.ejercicio_4.factory;

import com.mindwork.ejercicio_4.modelos.*;

public class UsuarioFactory {
    public Usuarios crearUsuario(Rol rol) {
        return switch (rol) {
            case ADMIN -> new Administrador();
            case EDITOR -> new Editor();
            case LECTOR -> new Lector();
        };
    }
}