package com.mindwork.ejercicio_5.factory;

import com.mindwork.ejercicio_5.modelo.*;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PagoFactory {
    private final Map<MetodosPago, Supplier<MetodoPago>> metodosRegistragos = new HashMap<>();

    public PagoFactory() {
        metodosRegistragos.put(MetodosPago.TARJETA, PagoTarjeta::new);
        metodosRegistragos.put(MetodosPago.CRYPTO, PagoTarjeta::new);
        metodosRegistragos.put(MetodosPago.PAYPAL, PagoTarjeta::new);
    }

    public MetodoPago crearMetodoPago(MetodosPago metodoPago) {
        Supplier<MetodoPago> metodoPagoSupplier = metodosRegistragos.get(metodoPago);
        if (metodoPagoSupplier == null) {
            throw new IllegalArgumentException("Metodo de pago no registrado");
        }
        return metodoPagoSupplier.get();
    }
}