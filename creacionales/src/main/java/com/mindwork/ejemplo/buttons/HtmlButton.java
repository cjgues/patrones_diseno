package com.mindwork.ejemplo.buttons;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }

    @Override
    public void createLabel(String text) {
        System.out.println("Text recibido: " + text);
    }
}