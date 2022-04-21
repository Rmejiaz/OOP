/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CuentaAhorros;


/**
 *
 * @author rafael
 */
public class ControladorCuentasAhorros implements CRUD{
    public static ArrayList<CuentaAhorros> arregloCuentasAhorros;
    
    public ControladorCuentasAhorros(){
        arregloCuentasAhorros = new ArrayList<CuentaAhorros>();
    }

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = true;
        
        CuentaAhorros cuenta = new CuentaAhorros();
        cuenta= (CuentaAhorros)obj;
        
        for(CuentaAhorros c:arregloCuentasAhorros)
            if(c.equals(cuenta)){
                return inserto = false;
            }
        
        arregloCuentasAhorros.add(cuenta);
        return inserto;
    }

    @Override
    public boolean modificar(Object obj_old, Object obj_new) {
        CuentaAhorros old_cuenta = new CuentaAhorros();
        old_cuenta = (CuentaAhorros)obj_old;
        
        CuentaAhorros new_cuenta = new CuentaAhorros();
        new_cuenta = (CuentaAhorros)obj_new;
        
        Collections.sort(arregloCuentasAhorros);
        int index = Collections.binarySearch(arregloCuentasAhorros, old_cuenta, null);
        
        if(index < 0)
            return false;
        else{
            arregloCuentasAhorros.set(index, new_cuenta);
            return true;
        }
    }

    @Override
    public boolean borrar(Object obj) {
        CuentaAhorros cuenta = new CuentaAhorros();
        cuenta = (CuentaAhorros)obj;
        Collections.sort(arregloCuentasAhorros);
        int index = Collections.binarySearch(arregloCuentasAhorros, cuenta, null);
        
        if(index<0)
            return false;
        else{
            arregloCuentasAhorros.remove(index);
            return true;
        }
    }

    @Override
    public Object consultarUno(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ordenar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void quicksort(int izq, int der) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
