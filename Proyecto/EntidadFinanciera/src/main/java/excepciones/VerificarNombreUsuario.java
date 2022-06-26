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
public class VerificarNombreUsuario extends Exception{
    
    public static String littleMessage;
    public VerificarNombreUsuario(String mensaje){
        super(mensaje);
    }
    
    public static void verificar(String nombre) throws VerificarNombreUsuario{
        if(nombre.length() < 3){
            littleMessage = "Demasiado corto (*)";
            throw new VerificarNombreUsuario("El y/o apellido del usuario debe tener más de 3 caracteres");
        }
        
        String regex = "^[a-zA-ZáéíóúÁÉÍÓÚ]+$";
        
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(nombre);
        
        if(!matcher.matches()){
            littleMessage = "Solo puede tener letras (*)";
            throw new VerificarNombreUsuario("El nombre y/o apellido solo puede contener letras");
        }
        
    }
   
    public static String getLittleMessage(){
        return littleMessage;
    }
    
    
}
