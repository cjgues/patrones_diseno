package com.mindwork.ejercicio_1.factory;

import com.mindwork.ejercicio_1.modelo.Button;
import com.mindwork.ejercicio_1.modelo.CheckBox;
import com.mindwork.ejercicio_1.modelo.imp.WindowsButton;
import com.mindwork.ejercicio_1.modelo.imp.WindowsCheckBox;

public class WindowsFactory extends GUIFactory {
    @Override
    public Button crearBoton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox crearCheckBox() {
        return new WindowsCheckBox();
    }
}
