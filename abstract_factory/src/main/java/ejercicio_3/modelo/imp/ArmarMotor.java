package ejercicio_3.modelo.imp;

import ejercicio_3.modelo.Motor;

public class ArmarMotor implements Motor {
    @Override
    public void encender() {
        System.out.println("Armar motor");
    }
}
