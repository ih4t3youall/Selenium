package org.objetos;

class Auto {
    String color;
    String modelo;
    int velocidad;
    int personasSentadas;

    void acelerar() {
        System.out.println("El coche está acelerando.");
        velocidad += 10;
    }

    void sentarPersona(){
        System.out.println("se sento una persona");
        personasSentadas += 1;
    }

    void bajarPersona(){
        System.out.println("se levanto una persona");
        personasSentadas -= 1;
    }

    void mostrarPersonasSentadas(){
        System.out.println("personas sentadas: "+personasSentadas);

    }

    void frenar() {
        System.out.println("El coche está frenando.");
        velocidad -= 10;
    }

    void mostrarVelocidad() {
        System.out.println("La velocidad actual del coche es: " + velocidad + " km/h");
    }
}