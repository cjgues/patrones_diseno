package ejercicio_2.factory;

import ejercicio_2.modelo.Hamburguesa;
import ejercicio_2.modelo.Papas;
import ejercicio_2.modelo.imp.PedidoHamburguesa;
import ejercicio_2.modelo.imp.PedidoPapas;

public class MenuFactoryMexico extends MenuFactory {
    @Override
    public Papas crearPapas() {
        return new PedidoPapas();
    }

    @Override
    public Hamburguesa crearHamburguesa() {
        return new PedidoHamburguesa();
    }
}
