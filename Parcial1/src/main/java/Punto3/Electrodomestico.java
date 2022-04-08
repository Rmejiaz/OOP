/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto3;

/**
 *
 * @author rafael
 */
public abstract class Electrodomestico {
    
   // Constantes
    
    public static final String COLOR_DEF = "blanco";
    public static final char CONSUMO_DEF = 'F';
    public static final double PRECIO_BASE_DEF = 1000000;
    public static final float PESO_DEF = 5;
    
    
    // Atributos
   
    protected double precio_base;
    protected String color;
    protected char consumo;
    protected float peso;
    protected String marca;
    
    //Construcores

    public Electrodomestico() {
        this.precio_base = PRECIO_BASE_DEF;
        this.color = COLOR_DEF;
        this.consumo = CONSUMO_DEF;
        this.peso = PESO_DEF;
    }

    public Electrodomestico(double precio_base, String color, char consumo, float peso, String marca) {
        this.precio_base = precio_base;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
        this.marca = marca;
    }
    
    public abstract double precioFinal();
    
}
