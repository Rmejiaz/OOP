/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import modelo.Cliente;

/**
 *
 * @author rafael
 */
public class ControladorClientes implements CRUD{
    
    public static ArrayList<Cliente> arregloClientes;
    
    public ControladorClientes(){
        arregloClientes = new ArrayList<Cliente>();
    }
    
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = true;
        
        Cliente cli = new Cliente();
        cli = (Cliente)obj;
        
        for(Cliente c:arregloClientes)
            if(c.equals(cli)){
                return inserto = false;
            }
        
        arregloClientes.add(cli);
        return inserto;
        
    }

    @Override
    public Object modificar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean borrar(Object obj) {
        Cliente cli = new Cliente();
        cli = (Cliente)obj;
        int index = 0;
        for(Cliente c:arregloClientes){
            if(c.equals(cli)){
                arregloClientes.remove(index);
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public void consultarUno(Object obj) {
        Cliente cli = new Cliente();
        cli = (Cliente)obj;
        boolean esta = false;
        for(Cliente c:arregloClientes){
            if(c.equals(cli)){
                System.out.println(c.toString());
                esta = true;
            }
        }
        if(!esta)
            System.out.println("Cliente no encontrado");
    }
    
    
    @Override
    public void consultarTodos(){
        for(Cliente c:arregloClientes)
            System.out.println(c.toString());
    }
    
    @Override
    public void ordenar(){
        Collections.sort(arregloClientes);
    }
    
}
