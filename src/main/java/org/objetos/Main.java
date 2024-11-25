package org.objetos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args)    {
        new Main();
    }
    public Main(){
        Persona persona = new Persona("unUsuario","unPassword");
        Persona persona1 = new Persona("unUsuario1","unPassword1");
        Persona persona2 = new Persona("unUsuario2","unPassword2");
        Persona persona3 = new Persona("unUsuario3","unPassword3");

        List<Persona> personas = new ArrayList<>();
        personas.add(persona);
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);

        for(int i=0; i<personas.size(); i++){
           personas.get(i).imprimirDatos();
        }
    }
}
