package com.mindwork.ejemplo.factory;

import com.mindwork.ejemplo.buttons.Button;
import com.mindwork.ejemplo.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
