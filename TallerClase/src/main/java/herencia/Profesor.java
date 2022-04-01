/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import abstractas.Persona;

/**
 *
 * @author rafael
 */
public abstract class Profesor  extends Persona {
    protected float sueldo;
    protected abstract float calcularSueldo(float sueldoBase, int puntaje);
    protected String nombreUniversidad(){
        return "Universidad Nacional de Colombia";
    }
}
