/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tallerexcepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    
    public static void cat(File file) throws IOException{
        RandomAccessFile input = null;
        String line = null;
        
        
        try{
            input = new RandomAccessFile(file, "r");
            while((line = input.readLine()) != null){
                System.out.println(line);
            }
            return;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Punto4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Punto4.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (input != null){
                input.close();
            }
        }
        
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
