package com.mindwork.ejercicio_1.factory;

import com.mindwork.ejercicio_1.modelo.Button;
import com.mindwork.ejercicio_1.modelo.CheckBox;

public abstract class GUIFactory {
    public abstract Button crearBoton();
    public abstract CheckBox crearCheckBox();
}