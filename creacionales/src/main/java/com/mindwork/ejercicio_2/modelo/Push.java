package com.mindwork.ejercicio_2.modelo;

public class Push implements Notificacion {
    @Override
    public void enviarMensaje(String text) {
        System.out.println(text + "\nNotificacion enviada por PUSH");
    }
}
