/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rafael
 */
public class Cliente extends Usuario implements Comparable<Cliente>{
//    private CuentaAhorros cuentaAho;
//    private CuentaCorriente cuentaCorr;

    public Cliente(String nombre, String apellido, String direccion, long telefono, String correo, int cedula, String contrasena) {
        super(nombre, apellido, direccion, telefono, correo, cedula, contrasena);
    }

    public Cliente() {
    }

    public Cliente(Cliente another) { // Constructor para crear copias
        this.nombre = another.nombre;
        this.apellido = another.apellido;
        this.direccion = another.apellido;
        this.telefono = another.telefono;
        this.correo = another.correo;
        this.cedula = another.cedula;
//        this.cuentaAho = another.cuentaAho;
//        this.cuentaCorr = another.cuentaCorr;
    }

    public Cliente(String text, String text0, String text1, int parseInt, String text2, int parseInt0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    @Override
    public int compareTo(Cliente c){
        return (this.getCedula() < c.getCedula()? -1:
                (this.getCedula() == c.getCedula()? 0 : 1));
    }
    
    
}
