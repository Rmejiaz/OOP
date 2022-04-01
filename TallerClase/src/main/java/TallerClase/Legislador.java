/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerClase;
import abstractas.Persona;

/**
 *
 * @author rafael
 */
public abstract class Legislador extends Persona {
    private String provinciaQueRepresenta;
    private String partido;
    
    public abstract String getCamaraEnQueTrabaja(); //Metodo abstracto

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    
   
    
}
