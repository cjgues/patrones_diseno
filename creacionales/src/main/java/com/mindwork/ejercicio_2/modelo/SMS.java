package com.mindwork.ejercicio_2.modelo;

public class SMS implements Notificacion {
    @Override
    public void enviarMensaje(String text) {
        System.out.println(text + "\nNotificacion enviada por SMS");
    }
}
