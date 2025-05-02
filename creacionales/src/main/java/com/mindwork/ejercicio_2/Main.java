package com.mindwork.ejercicio_2;

import com.mindwork.ejercicio_2.factory.NotificacionEmail;
import com.mindwork.ejercicio_2.factory.NotificacionFactory;
import com.mindwork.ejercicio_2.factory.NotificacionPush;
import com.mindwork.ejercicio_2.factory.NotificacionSMS;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2");

        enviarNotificacion(new NotificacionEmail(), "Mensaje creado para un email");
        System.out.println("=========================");
        enviarNotificacion(new NotificacionPush(), "Mensaje creado para un push");
        System.out.println("=========================");
        enviarNotificacion(new NotificacionSMS(), "Mensaje creado para un SMS");
        System.out.println("=========================");
    }

    public static void enviarNotificacion(NotificacionFactory notificacionFactory, String msg){
         var currentNotificacion = notificacionFactory.crearNotificacion();
        currentNotificacion.enviarMensaje(msg);
    }
}