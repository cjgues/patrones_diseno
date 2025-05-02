package ejercicio_2.modelo.imp;

import ejercicio_2.modelo.Papas;

public class PedidoPapas implements Papas {
    @Override
    public void pedir(String tipo) {
        System.out.println("Usted ha pedido el tipo de papas "+ tipo);
    }
}
