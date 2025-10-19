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
    public String nombre;
    public int edad;

    // Método
    public void maullar() {
        System.out.println(nombre + " dice: ¡miau miau!");
    }

    // Método para mostrar informacion
    public void mostrarInformacion() {
        System.out.println("Gato: " + nombre + ", Edad: " + edad + " años");
    }
    
}
