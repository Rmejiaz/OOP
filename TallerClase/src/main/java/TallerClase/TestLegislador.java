/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TallerClase;

import java.util.ArrayList;

/**
 *
 * @author rafael
 */
public class TestLegislador {

     public static ArrayList<Legislador> listaLegisladores;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        listaLegisladores = new ArrayList<Legislador>();
        
        Senador sen1 = new Senador();
        sen1.setNombre("Rafael");
        sen1.setApellido("Mejia");
        sen1.setPartido("sldkjlfsd");
        sen1.setProvinciaQueRepresenta("Caldas");
        sen1.setTelefono(314625);
        sen1.seteMail("rmejiaz@unal.edu.co");
        sen1.setDireccion("Calle 61");
        sen1.setCedula(13140);
        
        
        Senador sen2 = new Senador();
        sen2.setNombre("Juan");
        sen2.setApellido("Perez");
        sen2.setPartido("sldkjlfs");
        sen2.setProvinciaQueRepresenta("Risaralda");
        sen2.setTelefono(31462556);
        sen2.seteMail("jperezz@unal.edu.co");
        sen2.setDireccion("Calle 11");
        sen2.setCedula(1314000);
        
        Diputado dip1 = new Diputado();
        dip1.setNombre("Karen");
        dip1.setApellido("Agudelo");
        dip1.setPartido("Verde");
        dip1.setProvinciaQueRepresenta("Quindio");
        dip1.setTelefono(23421);
        dip1.seteMail("lsdflsdf");
        
        
        
        listaLegisladores.add(sen1);
        listaLegisladores.add(sen2);
        listaLegisladores.add(dip1);
        
        for(Legislador c:listaLegisladores){
            System.out.println("El legislador "+c.getNombre() + " trabaja en "+c.getCamaraEnQueTrabaja() + "y representa la región "+c.getProvinciaQueRepresenta());
        }
        
    }
    
}
