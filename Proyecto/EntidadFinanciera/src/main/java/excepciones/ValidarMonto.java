/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author rafael
 */
public class ValidarMonto extends Exception{

    // Clase para validar todos los montos (sueldos, montos en transacciones, etc)
    
    public ValidarMonto(String mensaje){
        super(mensaje);
    }
    
    public static void verificar(double monto) throws ValidarMonto{
        if(monto<0){
            throw new ValidarMonto("El monto debe ser mayor que 0");
        }
    }
    
    public static void verificar(float monto) throws ValidarMonto{
        if(monto<0){
            throw new ValidarMonto("El monto debe ser mayor que 0");
        }
    }
    
    
    public static void verificar(int monto) throws ValidarMonto{
        if(monto<0){
            throw new ValidarMonto("El monto debe ser mayor que 0");
        }
    }
}
