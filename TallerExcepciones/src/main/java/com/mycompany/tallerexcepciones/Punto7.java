/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tallerexcepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class Punto7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String value = JOptionPane.showInputDialog(null, "Enter value");
        
        try{
        int divisor = Integer.parseInt(value);
        System.out.println(3/divisor);
    
        }catch(NumberFormatException e){
            System.out.println("Por favor ingrese un número entero");
        }
        catch(ArithmeticException a){
            System.out.println("La operación no puede realizarse (posible división entre 0)");
        }
    }
}
