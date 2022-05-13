/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tipo2Punto1;

/**
 *
 * @author rafael
 */
public class Fiesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Guitarrista artista = new Guitarrista("Rafael", "Mejia", "Calle 61", "rmejiaz@unal.edu.co", "3146250295", 1007233130);
        
        System.out.println(artista.toString());
        
        System.out.println(artista.getInstrumento().getTipo());
    }
    
}
