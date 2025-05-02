package com.mindwork.ejercicio_1.modelo.imp;

import com.mindwork.ejercicio_1.modelo.Button;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Boton presionado en Windows");
    }
}
