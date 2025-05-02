package com.mindwork.ejemplo.factory;

import com.mindwork.ejemplo.buttons.Button;
import com.mindwork.ejemplo.buttons.WIndowsButton;

public class WindwosDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WIndowsButton();
    }
}
