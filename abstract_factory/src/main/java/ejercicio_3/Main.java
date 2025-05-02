package ejercicio_3;

import ejercicio_3.factory.FabricaCombustion;
import ejercicio_3.factory.FabricaElectrica;
import ejercicio_3.factory.VehiculosFactory;
import ejercicio_3.modelo.Pedido;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 3");

        VehiculosFactory vehiculosFactory;
        var origen = Pedido.COMBUSTION;

        vehiculosFactory = switch (origen){
            case COMBUSTION -> new FabricaCombustion();
            case ELECTRICIDAD -> new FabricaElectrica();
        };

        var currentMotor = vehiculosFactory.crearMotor();
        var currentTransmision = vehiculosFactory.crearTransmision();

        currentMotor.encender();
        currentTransmision.encender();
    }
}