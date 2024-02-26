package org.parkin.java.entities;


public class Empleado {

    //Atributos intrinsecos

    public String nombre;
    public String apellidos;

    //Atributo de relacion
    public String codigo;

    public Empleado() {
    }


    public Empleado(String Nombre, String Apellidos, String Codigo) {
        
     this.nombre = Nombre;
     this.apellidos = Apellidos;
     this.codigo = Codigo;
    }
    
}
