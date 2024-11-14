package org.example;

import java.util.LinkedList;
import java.util.List;

public class EstructurasDEControl {

    public static void main(String [] args){
        new EstructurasDEControl();
    }

    public EstructurasDEControl(){

        int edad = 25;
        if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else if (edad >= 18 && edad < 30) {
            System.out.println("Eres un adulto joven.");
        } else {
            System.out.println("Eres un adulto.");
        }

       System.out.println("------------------------");

        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Día no válido");
        }

        System.out.println("------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println("Número: " + i);
        }

        System.out.println("------------------------");

        List<String> nombres = new LinkedList();
        nombres.add("jose");
        nombres.add("ramon");
        nombres.add("otro nombre");

        for (String nombre: nombres) {
            System.out.println(nombre);
        }

        System.out.println("------------------------");

        int i = 0;
        do {
            System.out.println("Número: " + i);
            i++;
        } while (i < 5);
        System.out.println("------------------------");

    }
}
