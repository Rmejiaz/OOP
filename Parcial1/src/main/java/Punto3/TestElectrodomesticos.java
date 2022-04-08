/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Punto3;

import java.util.ArrayList;

/**
 *
 * @author rafael
 */
public class TestElectrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList arregloTienda = new ArrayList<Electrodomestico>();
        
        Lavadora lav1 = new Lavadora(20, 1000000, "blanco", 'F', 300, "Samsung");
        Lavadora lav2 = new Lavadora(21, 1000000, "negro", 'B', 300, "LG");
        Lavadora lav3 = new Lavadora(18, 1000000, "gris", 'C', 250, "Haceb");
         
        Televisor tel1 = new Televisor(40, true, 1000000, "negro", 'A', 2, "LG");
        Televisor tel2 = new Televisor(50, true, 1200000, "negro", 'B', 2, "Samsung");
        Televisor tel3 = new Televisor(60, true, 1200000, "negro", 'C', 3, "Xiaomi");
        
        arregloTienda.add(lav1);
        arregloTienda.add(lav2);
        arregloTienda.add(lav3);
        arregloTienda.add(tel1);
        arregloTienda.add(tel2);
        arregloTienda.add(tel3);
        
        for(Object c: arregloTienda)
            System.out.println(c.toString());
        
        
    }
    
}
