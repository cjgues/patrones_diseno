package com.mindwork.ejercicio_5;

import com.mindwork.ejercicio_5.decorador.ValidarPago;
import com.mindwork.ejercicio_5.factory.PagoFactory;
import com.mindwork.ejercicio_5.modelo.MetodosPago;

public class Main {

    public static PagoFactory pagoFactory;

    public static void main(String[] args) {
        System.out.println("Ejercicio 5");

        pagoFactory = new PagoFactory();
        realizarPago(MetodosPago.TARJETA, -30.00);
        realizarPago(MetodosPago.PAYPAL, 189.35);
        realizarPago(MetodosPago.CRYPTO, 10.00);
    }


    private static void realizarPago(MetodosPago metodosPago, double monto){
        var currentMetodo = pagoFactory.crearMetodoPago(metodosPago);
        var metodoDePagoValidado = new ValidarPago(currentMetodo);
        metodoDePagoValidado.pagar(monto);
    }
}