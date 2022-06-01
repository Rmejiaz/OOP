/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sustentacion;
import controlador.ControladorCajeros;
import java.util.Scanner;
import modelo.Cajero;
/**
 *
 * @author rafael
 */
public class PrincipalSustentacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControladorCajeros contrCaj = new ControladorCajeros();
        Scanner scan = new Scanner(System.in);
        
        
        Cajero caj1 = new Cajero(101, 1000000, "Rafael", "Mejia", "Calle 61A", 314625, "rmejiaz@unal.edu.co", 100723, "holamundo");
        Cajero caj2 = new Cajero(102, 1500000, "Claudia", "Zuluaga", "Calle 61A", 311600, "czuluaga@gmail.com", 3030, "12345");
        Cajero caj3 = new Cajero(103, 1200000, "Lorenzo", "Uribe", "Calle 70", 31456, "luribeo@unal.edu.co", 1234, "123321");
        Cajero caj4 = new Cajero(104, 900000, "Santiago", "Buitrago", "Calle 2", 31678, "sbuitragoo@unal.edu.co", 10072, "holita123");
        Cajero caj5 = new Cajero(105, 1300000, "Karen", "Agudelo", "Calle 50", 310825, "kvagudelof@unal.edu.co", 10062, "lksdjfl");
        
        
        contrCaj.insertar(caj1);
        contrCaj.insertar(caj2);
        contrCaj.insertar(caj3);
        contrCaj.insertar(caj4);
        contrCaj.insertar(caj5);
        
        
        System.out.println("Ingrese el id (cedula) que desea consultar: ");
        
        
        
        Cajero cajAux = new Cajero();
        cajAux.setCedula(scan.nextInt());
        
        Cajero consulta = (Cajero)contrCaj.consultarUno(cajAux);
        
        if(consulta.getNombre() == null)
            System.out.println("El cajero no se encuentra en el sistema");
        else
            System.out.println(consulta.toString());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
