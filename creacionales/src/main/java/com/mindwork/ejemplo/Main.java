package com.mindwork.ejemplo;

import com.mindwork.ejemplo.factory.Dialog;
import com.mindwork.ejemplo.factory.HtmlDialog;
import com.mindwork.ejemplo.factory.WindwosDialog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        dialog.renderWindow("Esto es pruebas");
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 11")) {
            dialog = new WindwosDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
}