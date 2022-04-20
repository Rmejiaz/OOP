/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rafael
 */
public class CuentaCorriente {
    private String idCuentaCorriente;
    private float saldoCuentaCorriente;
    private int idCliente;

    public CuentaCorriente(String idCuentaCorriente, float saldoCuentaCorriente, int idCliente) {
        this.idCuentaCorriente = idCuentaCorriente;
        this.saldoCuentaCorriente = saldoCuentaCorriente;
        this.idCliente = idCliente;
    }

    public CuentaCorriente() {
        
    }
    
    
    public String getIdCuentaCorriente() {
        return idCuentaCorriente;
    }

    public void setIdCuentaCorriente(String idCuentaCorriente) {
        this.idCuentaCorriente = idCuentaCorriente;
    }

    public float getSaldoCuentaCorriente() {
        return saldoCuentaCorriente;
    }

    public void setSaldoCuentaCorriente(float saldoCuentaCorriente) {
        this.saldoCuentaCorriente = saldoCuentaCorriente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
    
    
}
