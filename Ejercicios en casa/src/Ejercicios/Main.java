/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;
import modelo.Estudiante;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // 1. Crear estudiante con constructor
        Estudiante estudiante = new Estudiante("Mayra", 7,8,9 );
        // 2. Mostrar nombre y promedio
        System.out.println("nombre " + estudiante.getNombre());
        System.out.println("promedio " + estudiante.getPromedio());
        // 3. Mostrar estado (aprobado/desaprobado)
        System.out.println("Estado: " + estudiante.getEstado());
        // 4. Cambiar una nota con setter
        estudiante.setNota1(1);
        // 5. Mostrar de nuevo el promedio y estado
        System.out.println("\nDespues de cambiar la nota:");
        System.out.println("promedio: " + estudiante.getPromedio());
        System.out.println("Estado: " + estudiante.getEstado());
    }
    
}
