/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto3;

/**
 *
 * @author rafael
 */
public class Televisor extends Electrodomestico{

    //Atributos
    
    protected double resolucion;
    protected boolean tdt;

    public Televisor(double resolucion, boolean tdt) {
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Televisor(double resolucion, boolean tdt, double precio_base, String color, char consumo, float peso, String marca) {
        super(precio_base, color, consumo, peso, marca);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Televisor() {
    }
    
  

    @Override
    public String toString() {
        if(tdt)
            return "Televisor{" + "precio_base=" + precio_base + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + ", marca=" + marca + ", resolucion = "+resolucion+
                ", precio final = ,"+precioFinal()+", SI tiene tdt"+'}';
        else
            return "Televisor{" + "precio_base=" + precio_base + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + ", marca=" + marca + ", resolucion = "+resolucion+
                ", precio final = ,"+precioFinal()+"NO tiene tdt"+'}';
    }

    @Override
    public double precioFinal() {
        double precio_final = precio_base;
        
        if(resolucion > 40)
            precio_final = precio_final*1.3;
        
        if(tdt)
            precio_final = precio_final + 50000;
        
        return precio_final;
    }
    
    
}
