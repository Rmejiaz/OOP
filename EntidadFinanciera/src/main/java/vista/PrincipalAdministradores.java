/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorAdministradores;
import java.util.Scanner;
import modelo.Administrador;
/**
 *
 * @author rafael
 */
public class PrincipalAdministradores {
    ControladorAdministradores contrAdmin;
    Scanner leerDatos;
    
    
    public PrincipalAdministradores(){
        contrAdmin = new ControladorAdministradores();
        leerDatos = new Scanner(System.in);
    }
    
    
    public void leerDatosAdministrador(){
        Administrador admin = new Administrador();
        System.out.println("Digite el nombre del administrador");
        admin.setNombre(leerDatos.next());
        
        System.out.println("Digite el apellido del administrador");
        admin.setApellido(leerDatos.next());
        
        System.out.println("Digite la direccion del administrador");
        admin.setDireccion(leerDatos.next());
        
        System.out.println("Digite el telefono del administrador");
        admin.setTelefono(leerDatos.nextInt());
        
        System.out.println("Digite la cedula del administrador");
        admin.setCedula(leerDatos.nextInt());
        
        System.out.println("Digite el identificador especial del administrador");
        admin.setIdAdmin(leerDatos.nextInt());
        
        System.out.println("Digite el correo del administrador");
        admin.setCorreo(leerDatos.next());
        
        
        if(contrAdmin.insertar(admin))
            System.out.println("Administrador insertado exitosamente");
        else
            System.out.println("Error al insertar administraodr");
    }
    
    
    public void consultarTodos(){
        contrAdmin.consultarTodos();
    }
    
    public void consultarUno(){
        System.out.println("Digite la cedula del administrador que desea consultar");
        int cedula = leerDatos.nextInt();
        Administrador admin = new Administrador();
        admin.setCedula(cedula);
        admin = (Administrador)contrAdmin.consultarUno(admin);
        System.out.println(admin.toString());
    }
    
    public void ordenarDatos(){
        contrAdmin.ordenar();
    }
    
    public void eliminarAdministrador(){
        System.out.println("Digite la cedula del administrador que desea eliminar");
        int cedula = leerDatos.nextInt();
        Administrador admin = new Administrador();
        admin.setCedula(cedula);
        
        if(contrAdmin.borrar(admin))
            System.out.println("El administrador con cedula "+cedula +" ha sido eliminado del sistema");
        else
            System.out.println("Error al eliminar el administrador con cedula "+cedula+ " Es posible que no esté en el sistema");
    }
    
    public void ordenarDatosNombre(){
        contrAdmin.quicksort(0, contrAdmin.arregloAdministradores.size()-1);
    }
    
    
    public void modificarAdministrador(){
        System.out.println("Digite la cedula del administrador que desea modificar: ");
        int cedula = leerDatos.nextInt();
        Administrador admin = new Administrador();
        admin.setCedula(cedula);
        admin = (Administrador)contrAdmin.consultarUno(admin);
        System.out.println("Administrador a modificar: ");
        System.out.println(admin.toString());
        Administrador new_admin = new Administrador(admin); // Crear una copia de cli para modificarla
 
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
                new_admin.setNombre(leerDatos.next());
                break;
            case 2:
                new_admin.setApellido(leerDatos.next());
                break;
            case 3:
                new_admin.setDireccion(leerDatos.next());
                break;
            case 4:
                new_admin.setCorreo(leerDatos.next());
                break;
            case 5:
                new_admin.setTelefono(leerDatos.nextInt());
                break;
        }
        
        System.out.println("El Administrador queda de la siguiente forma: ");
        System.out.println(new_admin.toString());
        System.out.println("¿Desea guardar los cambios? [Y/n]");
        String opc2 = leerDatos.next();
        if("n".equals(opc2)){
            System.out.println("Cambios descartados");
        }
        else{
            System.out.println("Guardando cambios...");
            boolean success = contrAdmin.modificar(admin, new_admin);
            if(success)
                System.out.println("Administrador modificado exitosamente");
            else
                System.out.println("No se ha podido modificar el Administrador");
        }
        new_admin = null;

    }
    
    public void menu()
    {
        int opc;
        do{
        System.out.println("\nMenu de Administradores \n");
        System.out.println("1. Insertar");
        System.out.println("2. Consultar");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Consultar todos los administradores");
        System.out.println("6. Ordenar los administradores por cedula");
        System.out.println("7. Ordenar los administradores por nombre");
        System.out.println("8. Regresar al menu principal del banco");
        do
            opc = leerDatos.nextInt();
        while(opc > 8 || opc < 1);
        switch(opc){
            case 1:
                leerDatosAdministrador();
                break;
            case 2:
                consultarUno();
                break;
            case 3:
                modificarAdministrador();
                break;
            case 4:
                eliminarAdministrador();
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
