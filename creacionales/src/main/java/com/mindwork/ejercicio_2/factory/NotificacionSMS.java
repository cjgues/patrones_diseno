package com.mindwork.ejercicio_2.factory;

import com.mindwork.ejercicio_2.modelo.Notificacion;
import com.mindwork.ejercicio_2.modelo.SMS;

public class NotificacionSMS extends NotificacionFactory {
    @Override
    public Notificacion crearNotificacion() {
        return new SMS();
    }
}