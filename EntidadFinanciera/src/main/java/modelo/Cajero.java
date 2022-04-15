/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author rafael
 */
public class Cajero extends Usuario implements Comparable<Cajero>{
    private int idCajero;
    private double sueldo;

    public Cajero(int idCajero, double sueldo, String nombre, String apellido, String direccion, int telefono, String correo, int cedula) {
        super(nombre, apellido, direccion, telefono, correo, cedula);
        this.idCajero = idCajero;
        this.sueldo = sueldo;
    }

    public Cajero(int idCajero) {
        this.idCajero = idCajero;
    }

    public Cajero() {
    }
    
    
    public Cajero(Cajero another){
        this.idCajero = another.idCajero;
        this.sueldo = another.sueldo;
        this.nombre = another.nombre;
        this.apellido = another.apellido;
        this.direccion = another.direccion;
        this.telefono = another.telefono;
        this.correo = another.correo;
        this.cedula = another.cedula;
    }
    
    

    @Override
    public int compareTo(Cajero t){
        return (this.getCedula() < t.getCedula()? -1:
                (this.getCedula() == t.getCedula()? 0 : 1));
    }

    public int getIdCajero() {
        return idCajero;
    }

    public void setIdCajero(int idCajero) {
        this.idCajero = idCajero;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + ", cedula=" + cedula + ", idCajero="+
                idCajero + ", sueldo="+sueldo+'}';
    }
   
      
}
