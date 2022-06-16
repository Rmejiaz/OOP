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
public class ValidarContrasena extends Exception{
    
    public ValidarContrasena(String mensaje){
        super(mensaje);
    }
    
    public static void verificar(String cont) throws ValidarContrasena{
        
        
       String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[!*@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";        
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(cont);
        
        if(!matcher.matches()){
            throw new ValidarContrasena("La contraseña no es segura");
        }
}
}
