/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rafael
 */
public class CuentaAhorros implements Comparable<CuentaAhorros>{
    private String idCuentaAhorros;
    private float saldoCuentaAhorros;
    private int idCliente;

    public CuentaAhorros(String idCuentaAhorros, float saldoCuentaAhorros, int idCliente) {
        this.idCuentaAhorros = idCuentaAhorros;
        this.saldoCuentaAhorros = saldoCuentaAhorros;
        this.idCliente = idCliente;
    }

    public CuentaAhorros(){
        
    }
    
    public String getIdCuentaAhorros() {
        return idCuentaAhorros;
    }

    public void setIdCuentaAhorros(String idCuentaAhorros) {
        this.idCuentaAhorros = idCuentaAhorros;
    }

    public float getSaldoCuentaAhorros() {
        return saldoCuentaAhorros;
    }

    public void setSaldoCuentaAhorros(float saldoCuentaAhorros) {
        this.saldoCuentaAhorros = saldoCuentaAhorros;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
     @Override
    public int compareTo(CuentaAhorros c){
        return (this.getIdCuentaAhorros().compareToIgnoreCase(c.getIdCuentaAhorros())<0? -1:
                (this.getIdCuentaAhorros().compareToIgnoreCase(c.getIdCuentaAhorros())==0? 0 : 1));
    }
    
    
}
