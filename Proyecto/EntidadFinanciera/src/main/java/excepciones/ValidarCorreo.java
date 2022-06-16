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
    
    public static String littleMessage;
    public ValidarCorreo(String mensaje){
        super(mensaje);
    }
    
    public static void verificar(String email) throws ValidarCorreo{
                
        String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(email);
        
        
        if(email.equals("")){
            littleMessage = "Campo requerido (*)";
            throw new ValidarCorreo("El correo es un campo requerido");
        }
        else
        if(!matcher.matches()){
            littleMessage = "Correo no válido (*)";
            throw new ValidarCorreo("Ingrese un email valido de la forma usuario@dominio.xyz");
        }
    }
    
    public String getLittleMessage(){
        return littleMessage;
    }
    
    
}
