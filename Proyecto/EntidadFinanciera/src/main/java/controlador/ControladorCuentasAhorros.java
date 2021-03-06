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
    public static ArrayList<CuentaAhorros> arregloCuentasAhorros = new ArrayList<CuentaAhorros>();
    
    public ControladorCuentasAhorros(){
        //arregloCuentasAhorros = new ArrayList<CuentaAhorros>();
    }
    
    
    public boolean consultarCliente(int idCliente){
        for (CuentaAhorros cuenta:arregloCuentasAhorros){
            if(cuenta.getIdCliente() == idCliente){
                return true;
            }
        }
        return false;
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
        CuentaAhorros cuenta = new CuentaAhorros();
        cuenta = (CuentaAhorros)obj;
        Collections.sort(arregloCuentasAhorros);
        int pos = Collections.binarySearch(arregloCuentasAhorros, cuenta, null);
        if(pos < 0)
            return cuenta;
        else
            return arregloCuentasAhorros.get(pos);
    }

    @Override
    public void consultarTodos() {
        for(CuentaAhorros c:arregloCuentasAhorros)
            System.out.println(c.toString());
    }

    // Ordenar por id:
    @Override
    public void ordenar() {
        Collections.sort(arregloCuentasAhorros);
    }

    // Ordenar por id del titular (con quicksort):
    
    public void ordenarCedulas(){
        quicksort(0, arregloCuentasAhorros.size()-1);
    }
    
    // ordenar seg??n el saldo (tambi??n con quicksort):

    public void ordenarSaldo(){
        quicksort_2(0, arregloCuentasAhorros.size()-1);
    }
    
    
    public void quicksort_2(int izq, int der) { 
        //int pivote=A[izq]; // tomamos primer elemento como pivote
        CuentaAhorros pivote = arregloCuentasAhorros.get(izq);
        int i=izq;         // i realiza la b??squeda de izquierda a derecha
        int j=der;         // j realiza la b??squeda de derecha a izquierda
        CuentaAhorros aux;

        while(i < j){                          // mientras no se crucen las b??squedas                                   
          // while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
          while(arregloCuentasAhorros.get(i).getSaldoCuentaAhorros()<= pivote.getSaldoCuentaAhorros()&& i<j) i++; 
          
          //while(A[j] > pivote) j--;           // busca elemento menor que pivote
          while(arregloCuentasAhorros.get(j).getSaldoCuentaAhorros() > pivote.getSaldoCuentaAhorros()) j--;  
          if (i < j) {                        // si no se han cruzado                      
               aux = arregloCuentasAhorros.get(i);                      // los intercambia
               arregloCuentasAhorros.set(i, arregloCuentasAhorros.get(j));
               arregloCuentasAhorros.set(j, aux);
           }
         }

         //A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
         arregloCuentasAhorros.set(izq, arregloCuentasAhorros.get(j));
         //A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
         arregloCuentasAhorros.set(j, pivote);
         if(izq < j-1)
            quicksort(izq,j-1);          // ordenamos subarray izquierdo
         if(j+1 < der)
            quicksort(j+1,der);          // ordenamos subarray derecho

      }
    
    
   
    // implementaci??n de quicksort para ordenar por cedula
    @Override
    public void quicksort(int izq, int der) { 
        //int pivote=A[izq]; // tomamos primer elemento como pivote
        CuentaAhorros pivote = arregloCuentasAhorros.get(izq);
        int i=izq;         // i realiza la b??squeda de izquierda a derecha
        int j=der;         // j realiza la b??squeda de derecha a izquierda
        CuentaAhorros aux;

        while(i < j){                          // mientras no se crucen las b??squedas                                   
          // while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
          while(arregloCuentasAhorros.get(i).getIdCliente()<= pivote.getIdCliente()&& i<j) i++; 
          
          //while(A[j] > pivote) j--;           // busca elemento menor que pivote
          while(arregloCuentasAhorros.get(j).getIdCliente()> pivote.getIdCliente()) j--;  
          if (i < j) {                        // si no se han cruzado                      
               aux = arregloCuentasAhorros.get(i);                      // los intercambia
               arregloCuentasAhorros.set(i, arregloCuentasAhorros.get(j));
               arregloCuentasAhorros.set(j, aux);
           }
         }

         //A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
         arregloCuentasAhorros.set(izq, arregloCuentasAhorros.get(j));
         //A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
         arregloCuentasAhorros.set(j, pivote);
         if(izq < j-1)
            quicksort(izq,j-1);          // ordenamos subarray izquierdo
         if(j+1 < der)
            quicksort(j+1,der);          // ordenamos subarray derecho

      }
    
    
    public boolean existeCuenta(String idCuenta){  // para verificar si un cliente existe en el sistema
        CuentaAhorros cuenta = new CuentaAhorros();
        cuenta.setIdCuentaAhorros(idCuenta);
        Collections.sort(arregloCuentasAhorros);
        int pos = Collections.binarySearch(arregloCuentasAhorros, cuenta, null);
        return pos >= 0;
    }
    
}
