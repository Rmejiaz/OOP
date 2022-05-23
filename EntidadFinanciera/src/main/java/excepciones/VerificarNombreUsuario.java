/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author rafael
 */
public class VerificarNombreUsuario extends Exception{
    
    public VerificarNombreUsuario(String mensaje){
        super(mensaje);
    }
    
    public static void verificar(String nombre) throws VerificarNombreUsuario{
        if(nombre.length() < 3){
            throw new VerificarNombreUsuario("El nombre del usuario debe tener más de 3 caracteres");
        }
    }
   
    
    
}
