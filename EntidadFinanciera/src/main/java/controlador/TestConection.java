/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador;

import java.sql.Connection;

/**
 *
 * @author rafael
 */
public class TestConection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConexionBD conn = new ConexionBD();
        Connection con = conn.conexionMysql();
        
    }
    
}
