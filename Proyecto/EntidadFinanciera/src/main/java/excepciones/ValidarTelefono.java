/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

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
    
    public static void verificar(String telefono) throws  ValidarTelefono{
        if(telefono.length() < 10){
            throw new ValidarTelefono("El telefono debe tener más de 10 digitos");
        }
    }
    
}
