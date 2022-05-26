/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerexcepciones;

/**
 *
 * @author rafael
 */
public class Punto2 {
    public static void main(String[] args) {
        try{
            int a = 6/1;
        }
        catch(Exception e){
            System.out.println("Capturó la excepción "+e.getMessage());
        }
        
        
        int array[] = new int[2];
//        
//        try{
//            array[3] = 2;  // La posición es inválida
//        }
//        catch(Exception e){
//            e.printStackTrace(); // imprime toda la pila de errores que sucedieron
//        }
        
        

//        try{
//            array[3] = 1; // Posición inválida
//        }
//        catch(Exception e){
//            System.out.println("Mensaje de error: "+e.getMessage()); // imprime solo el mensaje del error
//        }
        
        
         try{
            array[3] = 1; // Posición inválida
        }
        catch(Exception e){
            System.out.println("Hubo un error al acceder a la posición en el array"); // mensaje de error propio
        }
        
        
        
        
        
    }
}
