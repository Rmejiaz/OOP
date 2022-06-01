/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.sql.Connection; // Realiza la conexión BD
import java.sql.DriverManager; // Carga el controlador de conexion
import java.sql.ResultSet; // Obtener respuesta del motor
import java.sql.Statement; // Crear consultas SQL  

/**
 *
 * @author rafael
 */
public class ConexionBD {
    
    public Connection conexionMysql() {
        Connection con = null;
        try
        {
            Class.forName("org.mariadb.jdbc.Driver"); //Cargo el driver de mysql
            con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/EntidadFinanciera","admin","password");
////            
//            con=DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/EntidadFinanciera?user=admin&password=password");
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("show databases;");
            System.out.println("Connected");  
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }  
}
    
    

