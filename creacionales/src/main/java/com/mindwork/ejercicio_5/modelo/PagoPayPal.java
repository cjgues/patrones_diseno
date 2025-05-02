package com.mindwork.ejercicio_5.modelo;

public class PagoPayPal implements MetodoPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Se esta realizado el pago por "+ String.format("%.2f", monto) + " con paypal");
    }
}
