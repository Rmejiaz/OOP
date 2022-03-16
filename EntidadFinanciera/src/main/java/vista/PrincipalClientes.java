/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorClientes;

/**
 *
 * @author rafael
 */
public class PrincipalClientes {
    ControladorClientes contrcli;
    
    public PrincipalClientes(){
        contrcli = new ControladorClientes();
    }
    
    public void leerDatosCliente(){
        // Ejercicio: insertar datos en el arreglo
    }
    
    
    public void menu()
    {
        int opc = 0;
        System.out.println("Menu Insertar datos de clientes");
        System.out.println("1. Insertar");
        System.out.println("2. Consultar");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        switch(opc){
            case 0 -> System.out.println("No hace nada");
        }
    }
    
}
