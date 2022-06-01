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
public class CuentaCorriente implements Comparable<CuentaCorriente>{
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
    
    
    public CuentaCorriente(CuentaCorriente another){
        this.idCuentaCorriente = another.idCuentaCorriente;
        this.saldoCuentaCorriente = another.saldoCuentaCorriente;
        this.idCliente = another.idCliente;
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
    
    @Override
    public int compareTo(CuentaCorriente c){
        return (this.getIdCuentaCorriente().compareToIgnoreCase(c.getIdCuentaCorriente())<0? -1:
                (this.getIdCuentaCorriente().compareToIgnoreCase(c.getIdCuentaCorriente())==0? 0 : 1));
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
        final CuentaCorriente other = (CuentaCorriente) obj;
        return Objects.equals(this.idCuentaCorriente, other.idCuentaCorriente);
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "idCuentaCorriente=" + idCuentaCorriente + ", saldoCuentaCorriente=" + saldoCuentaCorriente + ", idCliente=" + idCliente + '}';
    }   
    
    
    
}
