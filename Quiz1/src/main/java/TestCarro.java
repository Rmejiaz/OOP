/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author rafael
 */
public class TestCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro car = new Carro(2020, 1, "Rojo", "VW", 0, 1600);
        System.out.println(car.toString());
        Carro.velMax = 100;
        System.out.println("Velocidad maxima permitida para cualquier carro: "+Carro.velMax);
        
        car.avanzar(10, 5);
        
        System.out.println(car.toString());
    }
    
}
