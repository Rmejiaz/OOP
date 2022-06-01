/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorClientes;
import controlador.ControladorCuentasCorriente;
import java.util.Scanner;
import modelo.CuentaCorriente;

/**
 *
 * @author rafael
 */
public class PrincipalCuentasCorriente {
    ControladorCuentasCorriente contrCuentasCorriente;
    Scanner leerDatos;
    ControladorClientes contrcli;
    
    public PrincipalCuentasCorriente(ControladorClientes contrcli){
        contrCuentasCorriente = new ControladorCuentasCorriente();
        leerDatos = new Scanner(System.in);
        this.contrcli = contrcli;
    }
    
    public void leerDatosCuenta(){
        // Ejercicio: insertar datos en el arreglo
        
        CuentaCorriente cuenta = new CuentaCorriente();
        System.out.println("Digite la cedula del titular de la cuenta");
        
        int idCliente = leerDatos.nextInt();
        
        if(!contrcli.existeCliente(idCliente)){
            System.out.println("El cliente no existe en el sistema");
        }
        else{
        cuenta.setIdCliente(idCliente);
        System.out.println("Digite el numero de la cuenta");
        cuenta.setIdCuentaCorriente(leerDatos.next());
        
        System.out.println("Digite el saldo de la cuenta");
        cuenta.setSaldoCuentaCorriente(leerDatos.nextFloat());
        
        
        if(contrCuentasCorriente.insertar(cuenta))
            System.out.println("Cuenta creada");
        else
            System.out.println("Error al crear cuenta (posible duplicada)");
    
            }
        }
    
    public void consultarTodos(){
        contrCuentasCorriente.consultarTodos();
    }
    
    public void consultarUno(){
        System.out.println("Digite el id de la cuenta: ");
        String idCuenta = leerDatos.next();
        CuentaCorriente cuenta = new CuentaCorriente();
        cuenta.setIdCuentaCorriente(idCuenta);
        cuenta = (CuentaCorriente)contrCuentasCorriente.consultarUno(cuenta);
        System.out.println(cuenta.toString());
    }
    
    public void ordenarDatos(){
        contrCuentasCorriente.ordenar();
    }
    
    public void eliminarCuenta(){
        
        System.out.println("Digite el id de la cuenta de ahorros que desea borrar: ");
        String idCuenta = leerDatos.next();
        CuentaCorriente cuenta = new CuentaCorriente();
        cuenta.setIdCuentaCorriente(idCuenta);
        
        if(contrCuentasCorriente.borrar(cuenta))
            System.out.println("La cuenta con id "+idCuenta+ " ha sido eliminada exitosamente");
        else
            System.out.println("No se ha encontrado en el sistema alguna cuenta con id"+idCuenta);
    }
    
    public void ordenarDatosNombre(){
        contrCuentasCorriente.quicksort(0, contrCuentasCorriente.arregloCuentasCorriente.size()-1);
    }
    
    
    public void modificarCuenta(){
        System.out.println("Digite el id de la cuenta que desea modificar: ");
        String idCuenta = leerDatos.next();
        CuentaCorriente cuenta = new CuentaCorriente();
        cuenta.setIdCuentaCorriente(idCuenta);
        cuenta = (CuentaCorriente)contrCuentasCorriente.consultarUno(cuenta);
        System.out.println("Cuenta a modificar: ");
        System.out.println(cuenta.toString());
        CuentaCorriente new_cuenta = new CuentaCorriente(cuenta); // Crear una copia de cli para modificarla
 
        System.out.println("Digite nuevo saldo: ");
        new_cuenta.setSaldoCuentaCorriente(leerDatos.nextFloat());
        
        System.out.println("La cuenta queda de la siguiente forma: ");
        System.out.println(cuenta.toString());
        System.out.println("¿Desea guardar los cambios? [Y/n]");
        String opc2 = leerDatos.next();
        if("n".equals(opc2)){
            System.out.println("Cambios descartados");
        }
        else{
            System.out.println("Guardando cambios...");
            boolean success = contrCuentasCorriente.modificar(cuenta, new_cuenta);
            if(success)
                System.out.println("Cuenta modificada exitosamente");
            else
                System.out.println("No se ha podido modificar la cuenta");
        }
        new_cuenta = null;

    }
    
    
    public void menu()
    {
        int opc;
        do{
        System.out.println("\nMenu de Cuentas de Ahorros \n");
        System.out.println("1. Insertar");
        System.out.println("2. Consultar");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Consultar todas las cuentas de ahorros");
        System.out.println("6. Ordenar las cuentas por id");
        System.out.println("8. Regresar al menu principal del banco");
     
        do
            opc = leerDatos.nextInt();
        while(opc > 8 || opc < 1);
        
        switch(opc){
            case 1:
                leerDatosCuenta();
                break;
            case 2:
                consultarUno();
                break;
            case 3:
                modificarCuenta();
                break;
            case 4:
                eliminarCuenta();
                break;
            case 5:
                consultarTodos();
                break;
            case 6:
                ordenarDatos();
                break;
            
            default:
                break;
        }
    }while(opc != 8);
    }
    
}

