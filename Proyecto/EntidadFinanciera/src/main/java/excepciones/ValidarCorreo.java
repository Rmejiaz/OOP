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
public class ValidarCorreo extends Exception{
    
    public ValidarCorreo(String mensaje){
        super(mensaje);
    }
    
    public static void verificar(String email) throws ValidarCorreo{
                
        String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(email);
        
        if(!matcher.matches()){
            throw new ValidarCorreo("Ingrese un email valido de la forma usuario@dominio.xyz");
        }
    }
    
}
