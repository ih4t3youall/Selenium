package org.objetos;

public class Persona {

    String nombre;
    String password;

    public Persona(String nombre, String password){
        this.nombre = nombre;
        this.password = password;
    }

    public void imprimirDatos(){
        System.out.println("nombre: "+nombre);
        System.out.println("password: "+password);
    }

}
