/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author rafael
 */
public class ProfesorInterino extends Profesor {

    @Override
    protected float calcularSueldo(float sueldoBase, int puntaje) {
        sueldo =  sueldoBase*puntaje;
        return sueldo;
    }
   
    
}
