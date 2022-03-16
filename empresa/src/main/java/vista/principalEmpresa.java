/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Empleado;

/**
 *
 * @author rafael
 */
public class principalEmpresa {
    
     public static void main(String[] args) {
        Empleado objEmpleado = new Empleado();
        Scanner leer = new Scanner(System.in); // instanciacion de objeto de scanner para leer por teclado
        
        
        objEmpleado.setNombre("Carlos");
        objEmpleado.setApellido("Mata");
        objEmpleado.setArea("Financiera");
        objEmpleado.setSueldo(1000000);
        objEmpleado.setCedula(303333);
        
        Empleado objEmpleado2 = new Empleado("Rafael", "Mejia", "Electronica", 500000, 12345678);
        
        System.out.println("Empleado1"+objEmpleado.toString());
        System.out.println("Empleado2"+objEmpleado2.toString());
        
        objEmpleado.setCedula(987654321);
        
        System.out.println("Empleado1"+objEmpleado.toString());
        System.out.println("Empleado2"+objEmpleado2.toString());
        
        
        // Leer por teclado:
        
        System.out.println("Nombre del emplado: ");
        objEmpleado.setNombre(leer.next());
        System.out.println("Apellido: ");
        objEmpleado.setApellido(leer.next());
        System.out.println("Area: ");
        objEmpleado.setArea(leer.next());
        System.out.println("Sueldo: ");
        objEmpleado.setSueldo(leer.nextFloat());
        System.out.println("Cedula: ");
        objEmpleado.setCedula(leer.nextInt());
        
        System.out.println("Empleado1"+objEmpleado.toString());

        
        if(objEmpleado.equals(objEmpleado2)){
            System.out.println("Los empleados tienen la misma cedula");
        }
        else{
            System.out.println("Los empleados tienene cedula diferente");
        }
        
    }
    
    
}
