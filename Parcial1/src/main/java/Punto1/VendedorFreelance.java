/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1;

/**
 *
 * @author rafael
 */
public class VendedorFreelance extends Vendedor{

    double total_ventas;
    int cantidad_ventas;

    public VendedorFreelance(double total_ventas, int cantidad_ventas, int cedula, String nombre) {
        super(cedula, nombre);
        this.total_ventas = total_ventas;
        this.cantidad_ventas = cantidad_ventas;
    }
    
    
    @Override
    public void obtieneVentasDelUsuario(double total_ventas) {
        this.total_ventas = total_ventas;
    }

    @Override
    public void estableceVentas(int cantidad, double total) {
        this.total_ventas = total;
        this.cantidad_ventas = cantidad;
    }

    @Override
    public void imprimeVentasAnuales() {
        System.out.println("Las ventas del vendedor "+nombre+" fueron "+total_ventas);
    }

    @Override
    public void estableceNombre(char[] c) {
        String s = new String(c);
        this.nombre = s;
    }

    @Override
    public double totalVentasAnuales() {
        return total_ventas;
    }

    @Override
    public String toString() {
        return "VendedorFreelance{"+"Nombre= "+ nombre + ", total_ventas=" + total_ventas + ", cantidad_ventas=" + cantidad_ventas + '}';
    }
    
}
