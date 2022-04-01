/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerClase;

/**
 *
 * @author rafael
 */
public class Diputado extends Legislador {

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Asamblea de "+ getProvinciaQueRepresenta();
    }
    
}
