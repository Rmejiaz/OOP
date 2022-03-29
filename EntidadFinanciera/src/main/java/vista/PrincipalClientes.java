/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorClientes;
import java.util.Scanner;
import modelo.Cliente;

/**
 *
 * @author rafael
 */
public class PrincipalClientes {
    ControladorClientes contrcli;
    Scanner leerDatos;
    
    public PrincipalClientes(){
        contrcli = new ControladorClientes();
        leerDatos = new Scanner(System.in);
    }
    
    public void leerDatosCliente(){
        // Ejercicio: insertar datos en el arreglo
        
        Cliente cliT = new Cliente();
        System.out.println("Digite el nombre del cliente");
        cliT.setNombre(leerDatos.next());
        
        System.out.println("Digite el apellido del cliente");
        cliT.setApellido(leerDatos.next());
        
        System.out.println("Digite la direccion del cliente");
        cliT.setDireccion(leerDatos.next());
        
        System.out.println("Digite el telefono del cliente");
        cliT.setTelefono(leerDatos.nextInt());
        
        System.out.println("Digite la cedula del cliente");
        cliT.setCedula(leerDatos.nextInt());
        
        System.out.println("Digite el correo del cliente");
        cliT.setCorreo(leerDatos.next());
        
        
        if(contrcli.insertar(cliT))
            System.out.println("Cliente insertado");
        else
            System.out.println("Error al insertar cliente - duplicado");
    }
    
    public void consultarTodos(){
        contrcli.consultarTodos();
    }
    
    public void ordenarDatos(){
        contrcli.ordenar();
    }
    
    public void menu()
    {
        int opc = 0;
        System.out.println("Menu Insertar datos de clientes");
        System.out.println("1. Insertar");
        System.out.println("2. Consultar");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Consultar todos los clientes");
        System.out.println("6. Ordenar los clientes");
        
        opc = leerDatos.nextInt();
        switch(opc){
            case 1:
                leerDatosCliente();
                break;
            case 2:
                System.out.println("No implementado aun");
                break;
            case 3:
                System.out.println("No implementado aun");
                break;
            case 4:
                System.out.println("No implementado aun");
                break;
            case 5:
                consultarTodos();
                break;
            case 6:
                ordenarDatos();
                break;
            default:
                System.exit(0);
                break;
        }
    }
    
}
