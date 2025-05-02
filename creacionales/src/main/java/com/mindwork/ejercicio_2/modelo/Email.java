package com.mindwork.ejercicio_2.modelo;

public class Email implements Notificacion {
    @Override
    public void enviarMensaje(String text) {
        System.out.println(text + "\nNotificacion enviada por Email");
    }
}
