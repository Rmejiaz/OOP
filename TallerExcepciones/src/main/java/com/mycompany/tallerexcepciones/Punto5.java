/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tallerexcepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final String nomFich = "/home/rafael/Desktop/Universidad/2022-1/Programacion Orientada a Objetos/OOP/TallerExcepciones/src/main/java/com/mycompany/tallerexcepciones/datos.txt";
        
        Scanner in = null;
        
        
        //abre el fichero
        try {
            in = new Scanner(new FileReader(nomFich));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Punto5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //configura el formato de números
        
        in.useLocale(Locale.ENGLISH);
        
        //lee el fichero palabra a palabra
        
        try{
        while(in.hasNext()){
            
            //lee primera palabra
            
            String palabra = in.next();
            
            System.out.println("Palabra: "+palabra);
            
            // lee numeros
            
            while(in.hasNextDouble()){
                // Lee un double
                double d = in.nextDouble();
                System.out.println("Numero: "+d);
                
                
            }
            
            
        }}
        finally{
                if(in != null){
                in.close();
                }
                }
        
    }
    
}
