/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioJava;
import modelo.Gato;
/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear objeto instancia
        Gato miGato = new Gato();
        
        //asignar valores
        miGato.nombre="Shantsa";
        miGato.edad = 5;

        //Usar metodos
        miGato.mostrarInformacion();
        miGato.maullar();
    }
    
}
