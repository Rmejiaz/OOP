/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class PrincipalBanco {
 
    public static void main(String[] args){
        PrincipalClientes ppcliente = new PrincipalClientes();
        PrincipalAdministradores ppadmin = new PrincipalAdministradores();
        PrincipalCajeros ppcaj = new PrincipalCajeros();
        Scanner leerDatos = new Scanner(System.in);
        
        while(true)
        {
        System.out.println("\nMenu Principal del Banco \n");
        System.out.println("1. Menu de Administradores");
        System.out.println("2. Menu de Clientes");
        System.out.println("3. Menu de Cajeros");
        System.out.println("4. Salir");
        
        int opc = leerDatos.nextInt();
        
        switch(opc){
            case 1:
                ppadmin.menu();
                break;
            case 2:
                ppcliente.menu();
            case 3:
                ppcaj.menu();
                break;
            default:
                System.exit(0);
        }
        }
        
    }
}
