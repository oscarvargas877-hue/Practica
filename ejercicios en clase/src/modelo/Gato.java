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
    // atributos
    public String nombre;
    public int edad;
    
    //metodo
    public void maullar(){
        System.out.println(nombre + " dice miau miau");
    }
// metodo
    public void mostrarInformacion(){
        System.out.println("Gato: "  + nombre + " Edad: " + edad + " años");
    }
}
