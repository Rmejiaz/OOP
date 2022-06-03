/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.sql.Connection; // Realiza la conexión BD
import java.sql.DriverManager; // Carga el controlador de conexion
import java.sql.ResultSet; // Obtener respuesta del motor
import java.sql.Statement; // Crear consultas SQL  
import javax.swing.JOptionPane;

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
            JOptionPane.showMessageDialog(null, "Ha habido un error de conexión con la base de datos.\n (Verifique que los datos de ingreso"
                                                + "sean corrector y que la base de datos esté encendida");
            e.printStackTrace();
        }
        return con;
    }  
}
    
    

