/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Scanner;



/**
 *
 * @author rafael
 */
public class Empleado {
    // Area de atributos
    // Atributos de instancia de clase
    // Protegidos son visibles desde la herencia y desde clasea que pertencen
    private String nombre;
    private String apellido;
    private String area;
    private float sueldo;
    
    // Atributos de clase
    private int cedula;
    //Atributo de clase que es constante
    static final int horasLabDia = 8;
    //Area de constructores
                    // parametros de entrada de la clase
    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Empleado(String nombre, String apellido, String area, float sueldo, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.area = area;
        this.sueldo = sueldo;
        this.cedula = cedula;
    }

    

    public Empleado() {
    }
    
    
    // Area metodo de clase - Principal

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getArea() {
        return area;
    }

    public float getSueldo() {
        return sueldo;
    }

    public int getCedula() {
        return cedula;
    }

    public static int getHorasLabDia() {
        return horasLabDia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", area=" + area + ", sueldo=" + sueldo + ", cedula=" + cedula + 
                ", horas al dia=" + horasLabDia + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.cedula;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        return this.cedula == other.cedula;
    }
    
    
    
    
    
    
    
}// Fin de la clase
