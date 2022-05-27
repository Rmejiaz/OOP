/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tallerexcepciones;

/**
 *
 * @author rafael
 */
public class Punto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        System.out.println(3/0);
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
        }
        
    }
    
}
