/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerexcepciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author rafael
 */
public class InvalidEmailException extends Exception{
    
    public InvalidEmailException(String mensaje){
        super(mensaje);
    }
    
    public static void verificar(String email) throws InvalidEmailException{
                
        String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(email);
        
        if(!matcher.matches()){
            throw new InvalidEmailException("Por favor ingrese un email valido de la forma usuario@dominio.xyz");
        }
    }
    
}
