package com.mindwork.ejercicio_2.factory;

import com.mindwork.ejercicio_2.modelo.Email;
import com.mindwork.ejercicio_2.modelo.Notificacion;

public class NotificacionEmail extends NotificacionFactory {
    @Override
    public Notificacion crearNotificacion() {
        return new Email();
    }
}
