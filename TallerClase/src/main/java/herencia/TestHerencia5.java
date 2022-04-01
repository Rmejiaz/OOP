/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;
/**
 *
 * @author rafael
 */
public class TestHerencia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProfesorInterino profeI = new ProfesorInterino();
        profeI.setNombre("William");
        profeI.setApellido("Sarache");
        System.out.println("El profesor "+ profeI.getNombre() + " tiene un sueldo de " + profeI.calcularSueldo(100000, 380));
        System.out.println("Trabaja en "+profeI.nombreUniversidad());
        
        ProfesorTitular profeT = new ProfesorTitular();
        profeT.setNombre("Mauricio");
        profeI.setApellido("Orozco");
        System.out.println("El profesor"+ profeT.getNombre() + " tiene un sueldo de " + profeT.calcularSueldo(100000, 380));
        System.out.println("Trabaja en "+profeT.nombreUniversidad());
    }
    
}
