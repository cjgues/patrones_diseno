package ejercicio_3.factory;

import ejercicio_3.modelo.Motor;
import ejercicio_3.modelo.Transmision;

public abstract class VehiculosFactory {
    public abstract Motor crearMotor();
    public abstract Transmision crearTransmision();
}