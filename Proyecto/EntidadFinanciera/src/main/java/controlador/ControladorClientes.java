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
    
    public static ArrayList<Cliente> arregloClientes = new ArrayList<Cliente>();
    
    public ControladorClientes(){
//        arregloClientes = new ArrayList<Cliente>();
    }
    
    
    public boolean autenticar(int cedula, String contrasena){
        
        
        Cliente cli = new Cliente(cedula, contrasena);
        
        Collections.sort(arregloClientes);
        int pos = Collections.binarySearch(arregloClientes, cli, null);
        
        if (pos<0)
            return false;
        else
        {
            Cliente cli2 = arregloClientes.get(pos);
            return cli2.getContrasena().equals(contrasena); // Solo lo valida si la contrasena si coincide
        }
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
    public boolean modificar(Object obj_old, Object obj_new) {
        Cliente old_cli = new Cliente();
        old_cli = (Cliente)obj_old;
        
        Cliente new_cli = new Cliente();
        new_cli = (Cliente)obj_new;
        
        Collections.sort(arregloClientes);
        int index = Collections.binarySearch(arregloClientes, old_cli, null);
        
        if(index < 0)
            return false;
        else{
            arregloClientes.set(index, new_cli);
            return true;
        }
    }

    @Override
    public boolean borrar(Object obj) {
        Cliente cli = new Cliente();
        cli = (Cliente)obj;
        Collections.sort(arregloClientes);
        int index = Collections.binarySearch(arregloClientes, cli, null);
        
        if(index<0)
            return false;
        else{
            arregloClientes.remove(index);
            return true;
        }
         
    }

    @Override
    public Object consultarUno(Object obj) {
        
        /*
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
   
        */
        
        // Busqueda binaria, posición donde está el dato
        // el algoritmo lo requiere como precondición
        Cliente cli = new Cliente();
        cli = (Cliente)obj;
        Collections.sort(arregloClientes);
        int pos = Collections.binarySearch(arregloClientes, cli, null);
        if(pos < 0)
            return cli;
        else
            return arregloClientes.get(pos);
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

    @Override
    public void quicksort(int izq, int der) {
        //int pivote=A[izq]; // tomamos primer elemento como pivote
        Cliente pivote = arregloClientes.get(izq);
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        Cliente aux;

        while(i < j){                          // mientras no se crucen las búsquedas                                   
          // while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
          while(arregloClientes.get(i).getNombre().compareToIgnoreCase(pivote.getNombre()) <=0 && i<j) i++; 
          
          //while(A[j] > pivote) j--;           // busca elemento menor que pivote
          while(arregloClientes.get(j).getNombre().compareToIgnoreCase(pivote.getNombre()) > 0) j--;  
          if (i < j) {                        // si no se han cruzado                      
               aux = arregloClientes.get(i);                      // los intercambia
               arregloClientes.set(i, arregloClientes.get(j));
               arregloClientes.set(j, aux);
           }
         }

         //A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
         arregloClientes.set(izq, arregloClientes.get(j));
         //A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
         arregloClientes.set(j, pivote);
         if(izq < j-1)
            quicksort(izq,j-1);          // ordenamos subarray izquierdo
         if(j+1 < der)
            quicksort(j+1,der);          // ordenamos subarray derecho

      }
    
    
    public boolean existeCliente(int idCliente){  // para verificar si un cliente existe en el sistema
        Cliente cli = new Cliente();
        cli.setCedula(idCliente);
        Collections.sort(arregloClientes);
        int pos = Collections.binarySearch(arregloClientes, cli, null);
        return pos >= 0;
    }
    
    
    public static void mergeSort(int[] a, int n) {
    if (n < 2) {
        return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];

    for (int i = 0; i < mid; i++) {
        l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = a[i];
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid);

    merge(a, l, r, mid, n - mid);
}
    
    
}
