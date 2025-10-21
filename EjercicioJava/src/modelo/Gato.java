/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Gato {
     // Atributos
    private String nombre;
    private int edad;

    // Constructor
      public Gato(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    
    
    }
     //set y get
    // Método de encapsulamiento
    //set escribe-sobreescribe inicializa
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
 
    //get consultar-leer-obtener
    public String getNombre(){
        return nombre;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }
    //metodo de logica de negocio
    public void mostrarInformacion(){
        System.out.println("Gato " + nombre + " dice miau miau"+ " su edad es: "+ edad);
    }
            
    }
    

