package com.mindwork.ejercicio_1.app;

import com.mindwork.ejercicio_1.factory.GUIFactory;
import com.mindwork.ejercicio_1.modelo.Button;
import com.mindwork.ejercicio_1.modelo.CheckBox;

public class Application {
    private final Button button;
    private final CheckBox checkbox;

    public Application(GUIFactory factory) {
        button = factory.crearBoton();
        checkbox = factory.crearCheckBox();
    }

    public void paint(){
        button.click();
        checkbox.check();
    }
}
