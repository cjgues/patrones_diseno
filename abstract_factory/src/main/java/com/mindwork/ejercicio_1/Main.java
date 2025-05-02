package com.mindwork.ejercicio_1;

import com.mindwork.ejercicio_1.app.Application;
import com.mindwork.ejercicio_1.factory.GUIFactory;
import com.mindwork.ejercicio_1.factory.MacFactory;
import com.mindwork.ejercicio_1.factory.WindowsFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 1");

        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication() {
        Application app;
        GUIFactory guiFactory;

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            guiFactory = new MacFactory();
        } else {
            guiFactory = new WindowsFactory();
        }
        app = new Application(guiFactory);
        return app;
    }
}