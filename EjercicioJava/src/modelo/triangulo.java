/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class triangulo {
    //atreibutos 
    private String nombre;
    private double base;
    private double altura;
    
    
    //constructor argumentos
    public triangulo(String nombre, double base, double altura){
        this.nombre=nombre;
        this.base=base;
        this.altura=altura;
    
    }
    
    //Metodo de encapsulamiento getter y setter
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    
    }
    public void setBase(double base){
        this.base=base;   
    }
    public double getBase(){
        return base;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public double getAltura(){
        return altura;
    }
    //metodo de logica
    public void sacarArea(){
        double area = (this.base*this.altura)/2;
        System.out.println("el área del triangulo es: " + area + " su nombre es: "+ nombre );
    
    }
}
