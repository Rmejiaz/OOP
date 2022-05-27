/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class Punto3 {
    
    static Scanner leer = new Scanner(System.in);
    static int a; 
    
    
    public static void main(String[] args) {
        
        
        while(true){
        try{
         System.out.println("Ingrese un número entero: ");
         a = leer.nextInt();
         break;
        }catch (InputMismatchException b){
        
           System.out.println("Ocurrió un error, por favor ingrese un número entero");
           leer.nextLine();
           
        }catch (Exception e){
            System.out.println("Ocurrió otro error inesperado");
        }
    }}
}
