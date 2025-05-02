package com.mindwork.ejercicio_1.modelo.imp;

import com.mindwork.ejercicio_1.modelo.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Checkbox presionado en Windows");
    }
}
