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
public class Punto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese telefono: ");
        String email = scan.next();
        
        try{
        ValidarTelefono.verificar(email);
        }catch(ValidarTelefono e){
            System.out.println(e);
        }
    }
    }
    

