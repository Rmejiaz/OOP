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
public class ValidarTelefono extends Exception{
    
    public ValidarTelefono(String mensaje){
        super(mensaje);
    }
    
    public static void verificar(String numero) throws ValidarTelefono{
                
        String regex = "^\\\\d{10}$";
        
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(numero);
        
        if(!matcher.matches()){
            throw new ValidarTelefono("El telefono debe tener 10 digitos");
        }
    }
    
    
}
