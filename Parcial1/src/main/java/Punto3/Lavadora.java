/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto3;

/**
 *
 * @author rafael
 */
public class Lavadora extends Electrodomestico{

    // Atributos
    
    protected float cantidad_carga;

    // Constructores
    
    public Lavadora(float cantidad_carga, double precio_base, String color, char consumo, float peso, String marca) {
        super(precio_base, color, consumo, peso, marca);
        if(cantidad_carga<5)
            this.cantidad_carga = 5;
        else
            this.cantidad_carga = cantidad_carga;
    }

    public Lavadora() {
    }
 
    
    
    @Override
    public double precioFinal() {
        if(cantidad_carga >30)
            return precio_base + 20000;
        return precio_base;
    }

 
    
    @Override
    public String toString() {
        return "Lavadora{" + "precio_base=" + precio_base + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + ", marca=" + marca + ", cantidad_carga = "+cantidad_carga+
                ", precio final = ,"+precioFinal()+'}';
    }
 

 
    
}
