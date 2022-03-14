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
    String nombre;
    String apellido;
    String area;
    float sueldo;
    
    // Atributos de clase
    static int cedula;
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

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", area=" + area + ", sueldo=" + sueldo + ", cedula=" + cedula + 
                ", horas al dia=" + horasLabDia + '}';
    }
    
    
    
    public static void main(String[] args) {
        Empleado objEmpleado = new Empleado();
        Scanner leer = new Scanner(System.in); // instanciacion de objeto de scanner para leer por teclado
        
        
        objEmpleado.nombre = "Carlos";
        objEmpleado.apellido = "Mata";
        objEmpleado.area = "Financiera";
        objEmpleado.sueldo = 1000000;
        objEmpleado.cedula = 303333;
        
        Empleado objEmpleado2 = new Empleado("Rafael", "Mejia", "Electronica", 500000, 12345678);
        
        System.out.println("Empleado1"+objEmpleado.toString());
        System.out.println("Empleado2"+objEmpleado2.toString());
        
        Empleado.cedula = 987654321;
        
        System.out.println("Empleado1"+objEmpleado.toString());
        System.out.println("Empleado2"+objEmpleado2.toString());
        
        
        // Leer por teclado:
        
        System.out.println("Nombre del emplado: ");
        objEmpleado.nombre = leer.next();
        System.out.println("Apellido: ");
        objEmpleado.apellido = leer.next();
        System.out.println("Area: ");
        objEmpleado.area = leer.next();
        System.out.println("Sueldo: ");
        objEmpleado.sueldo = leer.nextFloat();
        System.out.println("Cedula: ");
        objEmpleado.cedula = leer.nextInt();
        
        System.out.println("Empleado1"+objEmpleado.toString());

    }
    
}// Fin de la clase
