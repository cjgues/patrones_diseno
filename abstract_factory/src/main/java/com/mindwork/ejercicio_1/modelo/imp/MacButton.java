package com.mindwork.ejercicio_1.modelo.imp;

import com.mindwork.ejercicio_1.modelo.Button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Boton presionado en Mac");
    }
}
