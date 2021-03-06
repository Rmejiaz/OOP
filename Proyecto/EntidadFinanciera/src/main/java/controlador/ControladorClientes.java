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
        
        // Busqueda binaria, posici??n donde est?? el dato
        // el algoritmo lo requiere como precondici??n
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
        quicksort(0, arregloClientes.size()-1);
    }

    public void ordenarNombres(){
        mergeSort(arregloClientes, arregloClientes.size());
    }
    
    
    //Se utiliza quicksort para ordenar por id:
    @Override
    public void quicksort(int izq, int der) { 
        //int pivote=A[izq]; // tomamos primer elemento como pivote
        Cliente pivote = arregloClientes.get(izq);
        int i=izq;         // i realiza la b??squeda de izquierda a derecha
        int j=der;         // j realiza la b??squeda de derecha a izquierda
        Cliente aux;

        while(i < j){                          // mientras no se crucen las b??squedas                                   
          // while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
          while(arregloClientes.get(i).getCedula() <= pivote.getCedula() && i<j) i++; 
          
          //while(A[j] > pivote) j--;           // busca elemento menor que pivote
          while(arregloClientes.get(j).getCedula() > pivote.getCedula()) j--;  
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
    
    // El ordenamiento por nombre se hace con mergesort:
    
        public static void mergeSort(ArrayList<Cliente> a, int n) {
            if (n < 2) {
                return;
            }
            int mid = n / 2;
            ArrayList<Cliente> l = new ArrayList<Cliente>();
            ArrayList<Cliente> r = new ArrayList<Cliente>();

            for (int i = 0; i < mid; i++) {
//                l[i] = a[i];
                l.add(a.get(i));
            }
            for (int i = mid; i < n; i++) {
//                r[i - mid] = a[i];
                  r.add(a.get(i));
            }
            mergeSort(l, mid);
            mergeSort(r, n - mid);

            merge(a, l, r, mid, n - mid);
        }
 
    
    public static void merge(ArrayList<Cliente> a, ArrayList<Cliente> l, ArrayList<Cliente> r, int left, int right) {

          int i = 0, j = 0, k = 0;
          while (i < left && j < right) {
              if (l.get(i).getNombre().compareToIgnoreCase(r.get(j).getNombre()) <= 0) {
//                  a[k++] = l[i++];
                  a.set(k++, l.get(i++));
              }
              else {
//                  a[k++] = r[j++];
                    a.set(k++, r.get(j++));
              }
          }
          while (i < left) {
//              a[k++] = l[i++];
                a.set(k++, l.get(i++));
          }
          while (j < right) {
//              a[k++] = r[j++];
                a.set(k++, r.get(j++));
          }
      }
    
    
    public boolean existeCliente(int idCliente){  // para verificar si un cliente existe en el sistema
        Cliente cli = new Cliente();
        cli.setCedula(idCliente);
        Collections.sort(arregloClientes);
        int pos = Collections.binarySearch(arregloClientes, cli, null);
        return pos >= 0;
    }
    
    
   
    
}
