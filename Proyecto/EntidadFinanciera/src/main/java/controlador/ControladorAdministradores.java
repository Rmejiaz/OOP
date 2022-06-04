/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Administrador;
import java.util.Collection;
import java.util.Collections;
/**
 *
 * @author rafael
 */
public class ControladorAdministradores implements CRUD{

    public static ArrayList<Administrador> arregloAdministradores = new ArrayList<Administrador>();

    public ControladorAdministradores() {
//        arregloAdministradores = 
    }
    
    
    public boolean autenticar(int cedula, String contrasena){
        
        
//        if(cedula == 1234 & contrasena.equals("1234"))
//            return true;
        
        
        Administrador admin = new Administrador(cedula, contrasena);
        
        Collections.sort(arregloAdministradores);
        int pos = Collections.binarySearch(arregloAdministradores, admin, null);
        
        if (pos<0)
            return false;
        else
        {
            Administrador admin2 = arregloAdministradores.get(pos);
            return admin2.getContrasena().equals(contrasena); // Solo lo valida si la contrasena si coincide
        }
    }
    
    
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = true;
        Administrador admin = new Administrador();
        admin = (Administrador)obj;
        
        for(Administrador c:arregloAdministradores)
            if(c.equals(admin)){
                return inserto = false;
            }
        
        arregloAdministradores.add(admin);
        return inserto;
    }

    @Override
    public boolean modificar(Object obj_old, Object obj_new) {
        Administrador old_admin = new Administrador();
        old_admin = (Administrador)obj_old;
        
        Administrador new_admin = new Administrador();
        new_admin = (Administrador)obj_new;
        
        Collections.sort(arregloAdministradores);
        int index = Collections.binarySearch(arregloAdministradores, old_admin, null);
        
        if(index < 0)
            return false;
        else{
            arregloAdministradores.set(index, new_admin);
            return true;
        }
    }

    @Override
    public boolean borrar(Object obj) {
        Administrador admin = new Administrador();
        admin = (Administrador)obj;
        Collections.sort(arregloAdministradores);
        int index = Collections.binarySearch(arregloAdministradores, admin, null);
        
        if(index<0)
            return false;
        else{
            arregloAdministradores.remove(index);
            return true;
        }
         
    }

    @Override
    public Object consultarUno(Object obj) {
        Administrador admin = new Administrador();
        admin = (Administrador)obj;
        
        int index = Collections.binarySearch(arregloAdministradores, admin, null);
        
        if(index < 0)
            return admin;
        else
            return arregloAdministradores.get(index);
    }

    @Override
    public void consultarTodos() {
        for(Administrador c:arregloAdministradores)
            System.out.println(c.toString());
    }

    @Override
    public void ordenar() {
        Collections.sort(arregloAdministradores);
    }

    @Override
    public void quicksort(int izq, int der) {
        //int pivote=A[izq]; // tomamos primer elemento como pivote
        Administrador pivote = arregloAdministradores.get(izq);
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        Administrador aux;

        while(i < j){                          // mientras no se crucen las búsquedas                                   
          // while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
          while(arregloAdministradores.get(i).getNombre().compareToIgnoreCase(pivote.getNombre()) <=0 && i<j) i++; 
          
          //while(A[j] > pivote) j--;           // busca elemento menor que pivote
          while(arregloAdministradores.get(j).getNombre().compareToIgnoreCase(pivote.getNombre()) > 0) j--;  
          if (i < j) {                        // si no se han cruzado                      
               aux = arregloAdministradores.get(i);                      // los intercambia
               arregloAdministradores.set(i, arregloAdministradores.get(j));
               arregloAdministradores.set(j, aux);
           }
         }

         //A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
         arregloAdministradores.set(izq, arregloAdministradores.get(j));
         //A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
         arregloAdministradores.set(j, pivote);
         if(izq < j-1)
            quicksort(izq,j-1);          // ordenamos subarray izquierdo
         if(j+1 < der)
            quicksort(j+1,der);          // ordenamos subarray derecho

      }
    
    
}
