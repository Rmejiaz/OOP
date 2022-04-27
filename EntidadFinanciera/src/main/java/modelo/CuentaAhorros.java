/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Objects;

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
    
    public CuentaAhorros(CuentaAhorros another){
        this.idCuentaAhorros = another.idCuentaAhorros;
        this.idCliente = another.idCliente;
        this.saldoCuentaAhorros = another.saldoCuentaAhorros;
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

    @Override
    public String toString() {
        return "CuentaAhorros{" + "idCuentaAhorros=" + idCuentaAhorros + ", saldoCuentaAhorros=" + saldoCuentaAhorros + ", idCliente=" + idCliente + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CuentaAhorros other = (CuentaAhorros) obj;
        return Objects.equals(this.idCuentaAhorros, other.idCuentaAhorros);
    }
   
    
    
    
       
}
