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
    
    public void consultarUno(){
        System.out.println("Digite la cedula del cliente que desea consultar: ");
        int cedula = leerDatos.nextInt();
        Cliente cli = new Cliente();
        cli.setCedula(cedula);
        cli = (Cliente)contrcli.consultarUno(cli);
        System.out.println(cli.toString());
    }
    
    public void ordenarDatos(){
        contrcli.ordenar();
    }
    
    public void eliminarCliente(){
        
        System.out.println("Digite la cedula del cliente que desea borrar: ");
        int cedula = leerDatos.nextInt();
        Cliente cli = new Cliente();
        cli.setCedula(cedula);
        
        if(contrcli.borrar(cli))
            System.out.println("El cliente con cedula "+cedula+ " ha sido eliminado exitosamente");
        else
            System.out.println("No se ha encontrado en el sistema algún cliente con cedula "+cedula);
    }
    
    public void ordenarDatosNombre(){
        contrcli.quicksort(0, contrcli.arregloClientes.size()-1);
    }
    
    
    public void modificarCliente(){
        System.out.println("Digite la cedula del cliente que desea modificar: ");
        int cedula = leerDatos.nextInt();
        Cliente cli = new Cliente();
        cli.setCedula(cedula);
        cli = (Cliente)contrcli.consultarUno(cli);
        System.out.println("Cliente a modificar: ");
        System.out.println(cli.toString());
        Cliente new_cli = new Cliente(cli); // Crear una copia de cli para modificarla
 
        System.out.println("Digite una opcion a modificar: ");
        System.out.println("1. Nombre");
        System.out.println("2. Apellido");
        System.out.println("3. Direccion");
        System.out.println("4. Correo");
        System.out.println("5. Telefono");
        int opc = leerDatos.nextInt();
        System.out.println("Digite nuevo dato: ");
        switch(opc){
            case 1:
                new_cli.setNombre(leerDatos.next());
                break;
            case 2:
                new_cli.setApellido(leerDatos.next());
                break;
            case 3:
                new_cli.setDireccion(leerDatos.next());
                break;
            case 4:
                new_cli.setCorreo(leerDatos.next());
                break;
            case 5:
                new_cli.setTelefono(leerDatos.nextInt());
                break;
        }
        
        System.out.println("El cliente queda de la siguiente forma: ");
        System.out.println(new_cli.toString());
        System.out.println("¿Desea guardar los cambios? [Y/n]");
        String opc2 = leerDatos.next();
        if("n".equals(opc2)){
            System.out.println("Cambios descartados");
        }
        else{
            System.out.println("Guardando cambios...");
            boolean success = contrcli.modificar(cli, new_cli);
            if(success)
                System.out.println("Cliente modificado exitosamente");
            else
                System.out.println("No se ha podido modificar el cliente");
        }
        new_cli = null;

    }
    
    
    
    
    public void menu()
    {
        int opc;
        do{
        System.out.println("\nMenu de Clientes \n");
        System.out.println("1. Insertar");
        System.out.println("2. Consultar");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Consultar todos los clientes");
        System.out.println("6. Ordenar los clientes por cedula");
        System.out.println("7. Ordenar los clientes por nombre");
        System.out.println("8. Regresar al menu principal del banco");
     
        do
            opc = leerDatos.nextInt();
        while(opc > 8 || opc < 1);
        
        switch(opc){
            case 1:
                leerDatosCliente();
                break;
            case 2:
                consultarUno();
                break;
            case 3:
                modificarCliente();
                break;
            case 4:
                eliminarCliente();
                break;
            case 5:
                consultarTodos();
                break;
            case 6:
                ordenarDatos();
                break;
            case 7:
                ordenarDatosNombre();
                break;
            default:
                break;
        }
    }while(opc != 8);
    }
    
}
