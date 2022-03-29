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
    
    //Atributos de clase:
    
    static float velMax; // velocidad maxima permitida

    public Carro(int modelo, float tanque, String color, String marca, float km) {
        this.modelo = modelo;
        this.tanque = tanque;
        this.color = color;
        this.marca = marca;
        this.km = km;
    } // Constructor
    
    
    public void avanzar(float tiempo, float velocidad){ // tiempo y velocidad son parametros del metodo avanzar
        
        if (velocidad > velMax)
            System.out.println("Velocidad no permitida, deteniendo carro");
        else{
            float distancia = velocidad*tiempo;
            this.km = this.km + distancia; //actualizar el kilometraje del carro
        }
    }
}
