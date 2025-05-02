package ejercicio_2;

import ejercicio_2.factory.MenuFactory;
import ejercicio_2.factory.MenuFactoryMexico;
import ejercicio_2.factory.MenuFactoryUSA;
import ejercicio_2.modelo.Origen;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2");

        MenuFactory menuFactory;
        var origen = Origen.MEXICO;

        menuFactory = switch (origen) {
            case MEXICO -> new MenuFactoryMexico();
            case USA -> new MenuFactoryUSA();
        };

        var hamburguesa =  menuFactory.crearHamburguesa();
        var papas = menuFactory.crearPapas();

        hamburguesa.pedir("cheddar");
        papas.pedir("fritas");
    }
}