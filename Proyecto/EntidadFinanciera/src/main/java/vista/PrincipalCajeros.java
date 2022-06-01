/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorCajeros;
import java.util.Scanner;
import modelo.Cajero;

/**
 *
 * @author rafael
 */
public class PrincipalCajeros {
    ControladorCajeros contrCaj;
    Scanner leerDatos;
    
    
    public PrincipalCajeros(){
        contrCaj = new ControladorCajeros();
        leerDatos = new Scanner(System.in);
    }
    
    
    public void leerDatosCajero(){
        Cajero caj = new Cajero();
        System.out.println("Digite el nombre del Cajero");
        caj.setNombre(leerDatos.next());
        
        System.out.println("Digite el apellido del Cajero");
        caj.setApellido(leerDatos.next());
        
        System.out.println("Digite la direccion del Cajero");
        caj.setDireccion(leerDatos.next());
        
        System.out.println("Digite el telefono del Cajero");
        caj.setTelefono(leerDatos.nextInt());
        
        System.out.println("Digite la cedula del Cajero");
        caj.setCedula(leerDatos.nextInt());
        
        System.out.println("Digite el identificador especial del Cajero");
        caj.setIdCajero(leerDatos.nextInt());
        
        System.out.println("Digite el correo del Cajero");
        caj.setCorreo(leerDatos.next());
        
        System.out.println("Digite el sueldo del cajero");
        caj.setSueldo(leerDatos.nextDouble());
        
        
        if(contrCaj.insertar(caj))
            System.out.println("Cajero insertado exitosamente");
        else
            System.out.println("Error al insertar Cajero (posible duplicado)");
    }
    
    
    public void consultarTodos(){
        contrCaj.consultarTodos();
    }
    
    public void consultarUno(){
        System.out.println("Digite la cedula del cajero que desea consultar");
        int cedula = leerDatos.nextInt();
        Cajero caj = new Cajero();
        caj.setCedula(cedula);
        caj = (Cajero)contrCaj.consultarUno(caj);
        System.out.println(caj.toString());
    }
    
    public void ordenarDatos(){
        contrCaj.ordenar();
    }
    
    public void eliminarCajero(){
        System.out.println("Digite la cedula del cajero que desea eliminar");
        int cedula = leerDatos.nextInt();
        Cajero caj = new Cajero();
        caj.setCedula(cedula);
        
        if(contrCaj.borrar(caj))
            System.out.println("El cajero con cedula "+cedula +" ha sido eliminado del sistema");
        else
            System.out.println("Error al eliminar el cajero con cedula "+cedula+ ". Es posible que no esté en el sistema");
    }
    
    public void ordenarDatosNombre(){
        contrCaj.quicksort(0, ControladorCajeros.arregloCajeros.size()-1);
    }
    
    
    public void modificarCajero(){
        System.out.println("Digite la cedula del administrador que desea modificar: ");
        int cedula = leerDatos.nextInt();
        Cajero caj = new Cajero();
        caj.setCedula(cedula);
        caj = (Cajero)contrCaj.consultarUno(caj);
        System.out.println("Cajero a modificar: ");
        System.out.println(caj.toString());
        Cajero new_caj = new Cajero(caj); // Crear una copia de cli para modificarla
 
        System.out.println("Digite una opcion a modificar: ");
        System.out.println("1. Nombre");
        System.out.println("2. Apellido");
        System.out.println("3. Direccion");
        System.out.println("4. Correo");
        System.out.println("5. Telefono");
        System.out.println("6. Sueldo");
        int opc = leerDatos.nextInt();
        System.out.println("Digite nuevo dato: ");
        switch(opc){
            case 1:
                new_caj.setNombre(leerDatos.next());
                break;
            case 2:
                new_caj.setApellido(leerDatos.next());
                break;
            case 3:
                new_caj.setDireccion(leerDatos.next());
                break;
            case 4:
                new_caj.setCorreo(leerDatos.next());
                break;
            case 5:
                new_caj.setTelefono(leerDatos.nextInt());
                break;
            case 6:
                new_caj.setSueldo(leerDatos.nextDouble());
                break;
        }
        
        System.out.println("El Administrador queda de la siguiente forma: ");
        System.out.println(new_caj.toString());
        System.out.println("¿Desea guardar los cambios? [Y/n]");
        String opc2 = leerDatos.next();
        if("n".equals(opc2)){
            System.out.println("Cambios descartados");
        }
        else{
            System.out.println("Guardando cambios...");
            boolean success = contrCaj.modificar(caj, new_caj);
            if(success)
                System.out.println("Cajero modificado exitosamente");
            else
                System.out.println("No se ha podido modificar el Cajero");
        }
        new_caj = null;

    }
    
    public void menu()
    {
        int opc;
        do{
        System.out.println("\nMenu de Cajeros \n");
        System.out.println("1. Insertar");
        System.out.println("2. Consultar");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Consultar todos los cajeros");
        System.out.println("6. Ordenar los cajeros por cedula");
        System.out.println("7. Ordenar los cajeros por nombre");
        System.out.println("8. Regresar al menu principal del banco");
        do
            opc = leerDatos.nextInt();
        while(opc > 8 || opc < 1);
        switch(opc){
            case 1:
                leerDatosCajero();
                break;
            case 2:
                consultarUno();
                break;
            case 3:
                modificarCajero();
                break;
            case 4:
                eliminarCajero();
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
