package ejercicio_2.factory;

import ejercicio_2.modelo.Hamburguesa;
import ejercicio_2.modelo.Papas;

public class MenuFactoryUSA extends MenuFactory {
    @Override
    public Papas crearPapas() {
        return null;
    }

    @Override
    public Hamburguesa crearHamburguesa() {
        return null;
    }
}
