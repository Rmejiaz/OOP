/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tallerexcepciones;

/**
 *
 * @author rafael
 */
public class Punto1 {

    public static void main(String[] args) {
        try{
            int a = 6/0;
        }
        finally{
            System.out.println("Entró al finally");
        }
    }
}
