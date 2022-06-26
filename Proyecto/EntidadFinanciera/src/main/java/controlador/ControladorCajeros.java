/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Cajero;

/**
 *
 * @author rafael
 */
public class ControladorCajeros implements CRUD{

    public static ArrayList<Cajero> arregloCajeros = new ArrayList<Cajero>();

    public ControladorCajeros() {
//        arregloCajeros = new ArrayList<Cajero>();
    }
    
    public boolean autenticar(int cedula, String contrasena){
        
      
        Cajero caj = new Cajero(cedula, contrasena);
        
        Collections.sort(arregloCajeros);
        int pos = Collections.binarySearch(arregloCajeros, caj, null);
        
        if (pos<0)
            return false;
        else
        {
            Cajero caj2 = arregloCajeros.get(pos);
            return caj2.getContrasena().equals(contrasena); // Solo lo valida si la contrasena si coincide
        }
    }
    
    
    
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = true;
        Cajero caj = new Cajero();
        caj = (Cajero)obj;
        
        for(Cajero c:arregloCajeros)
            if(c.equals(caj)){
                return inserto = false;
            }
        
        arregloCajeros.add(caj);
        return inserto;
    }

    @Override
    public boolean modificar(Object obj_old, Object obj_new) {
        Cajero old_caj = new Cajero();
        old_caj = (Cajero)obj_old;
        
        Cajero new_caj = new Cajero();
        new_caj = (Cajero)obj_new;
        
        Collections.sort(arregloCajeros);
        int index = Collections.binarySearch(arregloCajeros, old_caj, null);
        
        if(index < 0)
            return false;
        else{
            arregloCajeros.set(index, new_caj);
            return true;
        }
    }

    @Override
    public boolean borrar(Object obj) {
        Cajero caj = new Cajero();
        caj = (Cajero)obj;
        Collections.sort(arregloCajeros);
        int index = Collections.binarySearch(arregloCajeros, caj, null);
        
        if(index<0)
            return false;
        else{
            arregloCajeros.remove(index);
            return true;
        }
         
    }

    @Override
    public Object consultarUno(Object obj) {
        Cajero caj = new Cajero();
        caj = (Cajero)obj;
        Collections.sort(arregloCajeros);
        int pos = Collections.binarySearch(arregloCajeros, caj, null);
        if(pos < 0)
            return caj;
        else
            return arregloCajeros.get(pos);
    }

    @Override
    public void consultarTodos() {
        for(Cajero c:arregloCajeros)
            System.out.println(c.toString());
    }

    @Override
    public void ordenar(){
        quicksort(0, arregloCajeros.size()-1);
    }

    public void ordenarNombres(){
        mergeSort(arregloCajeros, arregloCajeros.size());
    }
    
    
    //Se utiliza quicksort para ordenar por id:
    @Override
    public void quicksort(int izq, int der) { 
        //int pivote=A[izq]; // tomamos primer elemento como pivote
        Cajero pivote = arregloCajeros.get(izq);
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        Cajero aux;

        while(i < j){                          // mientras no se crucen las búsquedas                                   
          // while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
          while(arregloCajeros.get(i).getCedula() <= pivote.getCedula() && i<j) i++; 
          
          //while(A[j] > pivote) j--;           // busca elemento menor que pivote
          while(arregloCajeros.get(j).getCedula() > pivote.getCedula()) j--;  
          if (i < j) {                        // si no se han cruzado                      
               aux = arregloCajeros.get(i);                      // los intercambia
               arregloCajeros.set(i, arregloCajeros.get(j));
               arregloCajeros.set(j, aux);
           }
         }

         //A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
         arregloCajeros.set(izq, arregloCajeros.get(j));
         //A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
         arregloCajeros.set(j, pivote);
         if(izq < j-1)
            quicksort(izq,j-1);          // ordenamos subarray izquierdo
         if(j+1 < der)
            quicksort(j+1,der);          // ordenamos subarray derecho

      }
    
    // El ordenamiento por nombre se hace con mergesort:
    
        public static void mergeSort(ArrayList<Cajero> a, int n) {
            if (n < 2) {
                return;
            }
            int mid = n / 2;
            ArrayList<Cajero> l = new ArrayList<Cajero>();
            ArrayList<Cajero> r = new ArrayList<Cajero>();

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
 
    
    public static void merge(ArrayList<Cajero> a, ArrayList<Cajero> l, ArrayList<Cajero> r, int left, int right) {

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
    
}
