/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
/**
 * Clase que representa a un estudiante con sus notas.
 * Paso 1: atributos
 * Paso 2: constructor
 * Paso 3: getters/setters
 * Paso 4: lógica (promedio, aprueba?)
 * Paso 5: toString (opcional)
 */

/**
 *
 * @author Usuario
 */
public class Estudiante {
     // 1. ATRIBUTOS (privados)
     private String nombre;
     private float nota1;
     private float nota2;
     private float nota3;


    // 2. CONSTRUCTOR
     public Estudiante (String nombre, float nota1, float nota2, float nota3){
             this.nombre=nombre;
             this.nota1=nota1;
             this.nota2=nota2;
             this.nota3=nota3;
    }
             public Estudiante(){}
     

    // 3. GETTERS Y SETTERS

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setNota1(float nota1){
        this.nota1=nota1;
    }
    public void setNota2(float nota2){
        this.nota2=nota2;
    }
    public void setNota3(float nota3){
        this.nota3=nota3;
    }
        public float getPromedio(){
        return(nota1+nota2+nota3)/3;
    }

    // 4. MÉTODOS DE LÓGICA
    public boolean aprueba(){
            return getPromedio()>=7;
    }
    public String getEstado(){
        if(aprueba()){
        return "aprobado";
        }else{
        return "desaprobado";
        }
    }
}

