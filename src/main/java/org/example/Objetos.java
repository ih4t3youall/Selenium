package org.example;

import org.objetos.Persona;

public class Objetos {

    public static void main(String [] args){
        new Objetos();
    }

    public Objetos(){

        Persona p = new Persona("Ronnie James","Dio", 99);

        System.out.println(p.getNombre());
    }

}
