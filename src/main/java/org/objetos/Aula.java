package org.objetos;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    public static void main(String [] args)    {
        new Aula();

    }

    public Aula(){
        List<Silla> sillas = crearSillas();

        imprimirEstadoSillas(sillas);
        agregarPersonas(sillas, 5);
        imprimirEstadoSillas(sillas);

        System.out.println("cantidad de sillas: "+sillas.size());

    }


    List<Silla> crearSillas(){
        List<Silla> sillas = new ArrayList<>();
        for (int i=0;i<10 ;i++){
            sillas.add(new Silla());
        }
        return sillas;
    }

    void agregarPersonas(List<Silla> sillas, int cantidadPersonas){
        for (int i=0;i<cantidadPersonas ;i++){
            System.out.println("print i:" +i);
            sillas.get(i).sentarPersona();
        }
    }

    void imprimirEstadoSillas(List<Silla> sillas){
        for (int i=0;i<10;i++){
            System.out.println("estado silla: "+i+" ocupada: "+sillas.get(i).hayPersona);
        }
    }
}
