package org.objetos;

import java.util.LinkedList;
import java.util.List;

public class ControlAuto {

    public static void main (String [] args)
    {
        new ControlAuto();
    }

    public ControlAuto(){
        Auto miCamioneta = new Auto();
        Auto miAuto = new Auto();

        miCamioneta.color = "Rojo";
        miCamioneta.modelo = "Toyota Hilux";
        miCamioneta.velocidad = 0;


        miCamioneta.acelerar();
        miCamioneta.mostrarVelocidad();
        miCamioneta.frenar();
        miCamioneta.mostrarVelocidad();

        miAuto.color = "Rojo";
        miAuto.modelo = "Toyota Corolla";
        miAuto.velocidad = 0;


        miAuto.acelerar();
        miAuto.acelerar();
        miAuto.mostrarVelocidad();
        miAuto.frenar();
        miAuto.mostrarVelocidad();


        List<Auto> autos = new LinkedList<Auto>();
        autos.add(miAuto);
        autos.add(miCamioneta);
    }
}
