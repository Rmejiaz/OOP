/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tallerexcepciones;

import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class Punto9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese email: ");
        String email = scan.next();
        
        try{
        InvalidEmailException.verificar(email);
        }catch(InvalidEmailException e){
            System.out.println(e);
        }
    }
    
}
