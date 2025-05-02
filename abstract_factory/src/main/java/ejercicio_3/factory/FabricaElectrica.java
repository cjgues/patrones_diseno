package ejercicio_3.factory;

import ejercicio_3.modelo.Motor;
import ejercicio_3.modelo.Transmision;
import ejercicio_3.modelo.imp.ArmarMotor;
import ejercicio_3.modelo.imp.ArmarTransmision;

public class FabricaElectrica extends VehiculosFactory {

    @Override
    public Motor crearMotor() {
        return new ArmarMotor();
    }

    @Override
    public Transmision crearTransmision() {
        return new ArmarTransmision();
    }
}
