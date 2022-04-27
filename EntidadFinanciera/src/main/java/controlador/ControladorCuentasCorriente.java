/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.CuentaCorriente;

/**
 *
 * @author rafael
 */
public class ControladorCuentasCorriente implements CRUD{
    public static ArrayList<CuentaCorriente> arregloCuentasCorriente = new ArrayList<CuentaCorriente>();
    
    public ControladorCuentasCorriente(){
       // arregloCuentasCorriente = new ArrayList<CuentaCorriente>();
    }

    @Override
    public boolean insertar(Object obj) {
        boolean inserto = true;
        
        CuentaCorriente cuenta = new CuentaCorriente();
        cuenta= (CuentaCorriente)obj;
        
        for(CuentaCorriente c:arregloCuentasCorriente)
            if(c.equals(cuenta)){
                return inserto = false;
            }
        
        arregloCuentasCorriente.add(cuenta);
        return inserto;
    }

    @Override
    public boolean modificar(Object obj_old, Object obj_new) {
        CuentaCorriente old_cuenta = new CuentaCorriente();
        old_cuenta = (CuentaCorriente)obj_old;
        
        CuentaCorriente new_cuenta = new CuentaCorriente();
        new_cuenta = (CuentaCorriente)obj_new;
        
        Collections.sort(arregloCuentasCorriente);
        int index = Collections.binarySearch(arregloCuentasCorriente, old_cuenta, null);
        
        if(index < 0)
            return false;
        else{
            arregloCuentasCorriente.set(index, new_cuenta);
            return true;
        }
    }

    @Override
    public boolean borrar(Object obj) {
        CuentaCorriente cuenta = new CuentaCorriente();
        cuenta = (CuentaCorriente)obj;
        Collections.sort(arregloCuentasCorriente);
        int index = Collections.binarySearch(arregloCuentasCorriente, cuenta, null);
        
        if(index<0)
            return false;
        else{
            arregloCuentasCorriente.remove(index);
            return true;
        }
    }

    @Override
    public Object consultarUno(Object obj) {
        CuentaCorriente cuenta = new CuentaCorriente();
        cuenta = (CuentaCorriente)obj;
        Collections.sort(arregloCuentasCorriente);
        int pos = Collections.binarySearch(arregloCuentasCorriente, cuenta, null);
        if(pos < 0)
            return cuenta;
        else
            return arregloCuentasCorriente.get(pos);
    }

    @Override
    public void consultarTodos() {
        for(CuentaCorriente c:arregloCuentasCorriente)
            System.out.println(c.toString());
    }

    @Override
    public void ordenar() {
        Collections.sort(arregloCuentasCorriente);
    }

    @Override
    public void quicksort(int izq, int der) {
        //int pivote=A[izq]; // tomamos primer elemento como pivote
        CuentaCorriente pivote = arregloCuentasCorriente.get(izq);
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        CuentaCorriente aux;

        while(i < j){                          // mientras no se crucen las búsquedas                                   
          // while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
          while(arregloCuentasCorriente.get(i).getIdCuentaCorriente().compareToIgnoreCase(pivote.getIdCuentaCorriente()) <=0 && i<j) i++; 
          
          //while(A[j] > pivote) j--;           // busca elemento menor que pivote
          while(arregloCuentasCorriente.get(j).getIdCuentaCorriente().compareToIgnoreCase(pivote.getIdCuentaCorriente()) > 0) j--;  
          if (i < j) {                        // si no se han cruzado                      
               aux = arregloCuentasCorriente.get(i);                      // los intercambia
               arregloCuentasCorriente.set(i, arregloCuentasCorriente.get(j));
               arregloCuentasCorriente.set(j, aux);
           }
         }

         //A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
         arregloCuentasCorriente.set(izq, arregloCuentasCorriente.get(j));
         //A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
         arregloCuentasCorriente.set(j, pivote);
         if(izq < j-1)
            quicksort(izq,j-1);          // ordenamos subarray izquierdo
         if(j+1 < der)
            quicksort(j+1,der);          // ordenamos subarray derecho
    }
}
