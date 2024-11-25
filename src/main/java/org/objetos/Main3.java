package org.objetos;

public class Main3 {

    public static void main(String [] args)    {
        new Main3();

    }
    public Main3(){
        int numero = 0;

        Auto auto = new Auto();
        auto.color = "rojo";
        auto.modelo= "toyota corolla";
        auto.sentarPersona();
        auto.sentarPersona();
        auto.mostrarPersonasSentadas();
        auto.acelerar();
        auto.acelerar();
        auto.acelerar();
        auto.mostrarVelocidad();
        auto.frenar();
        auto.frenar();
        auto.mostrarVelocidad();
        auto.frenar();
        auto.bajarPersona();
        auto.bajarPersona();
        auto.mostrarPersonasSentadas();
        auto.mostrarVelocidad();



    }

}
