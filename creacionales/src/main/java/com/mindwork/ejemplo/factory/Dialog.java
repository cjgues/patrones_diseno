package com.mindwork.ejemplo.factory;

import com.mindwork.ejemplo.buttons.Button;

public abstract class Dialog {
    public void renderWindow(String text){
        Button okButton = createButton();
        okButton.createLabel(text);
        okButton.render();
    }

    public abstract Button createButton();
}