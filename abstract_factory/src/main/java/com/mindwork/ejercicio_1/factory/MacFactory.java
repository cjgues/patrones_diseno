package com.mindwork.ejercicio_1.factory;

import com.mindwork.ejercicio_1.modelo.Button;
import com.mindwork.ejercicio_1.modelo.CheckBox;
import com.mindwork.ejercicio_1.modelo.imp.MacButton;
import com.mindwork.ejercicio_1.modelo.imp.MacCheckBox;

public class MacFactory extends GUIFactory {
    @Override
    public Button crearBoton() {
        return new MacButton();
    }

    @Override
    public CheckBox crearCheckBox() {
        return new MacCheckBox();
    }
}
