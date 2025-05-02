package ejercicio_2.factory;

import ejercicio_2.modelo.Hamburguesa;
import ejercicio_2.modelo.Papas;

public abstract class MenuFactory {
    public abstract Papas crearPapas();
    public abstract Hamburguesa crearHamburguesa();
}