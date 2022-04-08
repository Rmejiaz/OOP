/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1;

/**
 *
 * @author rafael
 */
public abstract class Vendedor {
    protected int cedula;
    protected String nombre;
    
    public Vendedor(int cedula, String nombre){
        this.nombre = nombre;
        this.cedula = cedula;
    }
    
    public abstract void obtieneVentasDelUsuario(double total_ventas);
    public abstract void estableceVentas(int cantidad, double total);
    public abstract void imprimeVentasAnuales();
    public abstract void estableceNombre(char []c);
    public abstract double totalVentasAnuales();

    @Override
    public String toString() {
        return "Vendedor{" + "cedula=" + cedula + ", nombre=" + nombre + '}';
    }
    
    
}
