package ejercicio_2.modelo.imp;

import ejercicio_2.modelo.Hamburguesa;

public class PedidoHamburguesa implements Hamburguesa {
    @Override
    public void pedir(String tipo) {
        System.out.println("Usted ha pedido el tipo de hamburguesa " + tipo );
    }
}
