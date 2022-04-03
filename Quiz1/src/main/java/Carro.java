/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafael
 */
public class Carro {
    // Atributos de instancia:
    private int modelo; // año de venta del carro
    private float tanque; // numero entre 0 y 100 especificando el porcentaje actual del tanque
    private String color; 
    private String marca;
    private float km;
    private float motor;
    
    //Atributos de clase:
    
    static float velMax; // velocidad maxima permitida

    public Carro(int modelo, float tanque, String color, String marca, float km, float motor) {
        this.modelo = modelo;
        this.tanque = tanque;
        this.color = color;
        this.marca = marca;
        this.km = km;
        this.motor = motor;
    } // Constructor
    
    public Carro(){
        
    }
    
    public void avanzar(float tiempo, float velocidad){ // tiempo y velocidad son parametros del metodo avanzar
        
        if (velocidad > velMax)
            System.out.println("Velocidad no permitida, deteniendo carro");
        else{
            float distancia = velocidad*tiempo;
            float gasto = (10/motor)*distancia;
   
            if(tanque<gasto)
                System.out.println("No alcanza la gasolina para avanzar la distancia");
            else{
                km = km + distancia; //actualizar el kilometraje del carro
                tanque = tanque - gasto; // Actualizar el tanque
        
            }
        }
    }
    
    public void llenar(){
        tanque = 1;
    }
    
    public void tanquear(float cant){
        tanque = tanque + cant;
        if(tanque>1)
            tanque = 1;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", tanque=" + tanque + ", color=" + color + ", marca=" + marca + ", km=" + km + ", motor=" + motor + '}';
    }

    
}
