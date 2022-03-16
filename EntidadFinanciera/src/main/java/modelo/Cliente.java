/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rafael
 */
public class Cliente extends Usuario{
    private CuentaAhorros cuentaAho;
    private CuentaCorriente cuentaCorr;

    public Cliente(String nombre, String apellido, String direccion, int telefono, String correo, int cedula) {
        super(nombre, apellido, direccion, telefono, correo, cedula);
    }

    public Cliente() {
    }
    
    
    
}
