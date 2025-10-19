/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciojava;
import modelo.Gato;

/**
 *
 * @author Usuario
 */
public class EjercicioJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear objeto (instancia)
        Gato miGato = new Gato();

        // Asignar valores
        miGato.nombre = "Shantsa";
        miGato.edad = 3;

        // Usar métodos
        miGato.mostrarInformacion();
        miGato.maullar();
    }
    
}
