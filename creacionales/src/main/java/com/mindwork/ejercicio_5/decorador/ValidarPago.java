package com.mindwork.ejercicio_5.decorador;

import com.mindwork.ejercicio_5.modelo.MetodoPago;

public class ValidarPago implements MetodoPago {
    private final MetodoPago metodoPago;

    public ValidarPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    @Override
    public void pagar(double monto) {
        if(monto < 0){
            System.out.println("El monto no puede ser negativo");
            return;
        }

        metodoPago.pagar(monto);
    }
}
