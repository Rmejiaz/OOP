/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Administrador;
import modelo.Cajero;
import modelo.Cliente;
import modelo.CuentaAhorros;
import modelo.CuentaCorriente;

/**
 *
 * @author rafael
 */
public class ControladorBD {
    
    private static ConexionBD connBD;
    private static Connection con;
    private ControladorAdministradores contrAdmin;
    private ControladorClientes contrCli;
    private ControladorCuentasAhorros contrCuentasAho;
    private ControladorCuentasCorriente contrCuentasCorr;
    private ControladorCajeros contrCaj;
    
    
    public ControladorBD(){
        
        // Establecer conexion con base de datos
        try{
        connBD = new ConexionBD();
        con = connBD.conexionMysql();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha habido un error al conectarse a la base de datos");
            e.printStackTrace();
        }
        // Instanciar controladores
        contrAdmin = new ControladorAdministradores();
        contrCli = new ControladorClientes();
        contrCuentasAho = new ControladorCuentasAhorros();
        contrCuentasCorr = new ControladorCuentasCorriente(); 
        contrCaj = new ControladorCajeros();
    }
    
    
    public void actualizarControladores(){
        
        // Se hacen todos los queries y se llenan los controladores
        
        // Para cuentas corriente
        String query = "SELECT * FROM EntidadFinanciera.CUENTA_CORRIENTE";
        
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = (Statement)con.createStatement();
            
            if(stmt.execute(query)){
                rs = stmt.getResultSet();
                while(rs.next()){
                    CuentaCorriente tempcc = new CuentaCorriente(rs.getString("IdCuenta"), rs.getFloat("Saldo"), rs.getInt("IdCliente"));
                    contrCuentasCorr.insertar(tempcc);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
        }
        
        
        // Para cuentas de ahorros
        
        query = "SELECT * FROM EntidadFinanciera.CUENTA_AHORROS";
        
        stmt = null;
        rs = null;
        
        try {
            stmt = (Statement)con.createStatement();
            
            if(stmt.execute(query)){
                rs = stmt.getResultSet();
                while(rs.next()){
                    CuentaAhorros tempca = new CuentaAhorros(rs.getString("IdCuenta"), rs.getFloat("Saldo"), rs.getInt("IdCliente"));
                    contrCuentasAho.insertar(tempca);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
        }
        
        // Para clientes
        
        query = "SELECT * FROM EntidadFinanciera.CLIENTE";
        
        stmt = null;
        rs = null;
        
        try {
            stmt = (Statement)con.createStatement();
            
            if(stmt.execute(query)){
                rs = stmt.getResultSet();
                while(rs.next()){
                    Cliente tempcli = new Cliente(rs.getString("Nombre"), rs.getString("Apellido"), rs.getString("Direccion"), rs.getLong("Telefono"),
                                                 rs.getString("Correo"), rs.getInt("Cedula"), rs.getString("Contrasena"));
                    contrCli.insertar(tempcli);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
        }
        
        
        
         // Para administradores
        
        query = "SELECT * FROM EntidadFinanciera.ADMINISTRADOR";
        
        stmt = null;
        rs = null;
        
        try {
            stmt = (Statement)con.createStatement();
            
            if(stmt.execute(query)){
                rs = stmt.getResultSet();
                while(rs.next()){
                    Administrador tempadmin = new Administrador(rs.getInt("IdAdmin"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getString("Direccion"), rs.getLong("Telefono"),
                                                 rs.getString("Correo"), rs.getInt("Cedula"), rs.getString("Contrasena"));
                    contrAdmin.insertar(tempadmin);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
        }
        
        // Para cajeros
        
        query = "SELECT * FROM EntidadFinanciera.CAJERO";
        
        stmt = null;
        rs = null;
        
        try {
            stmt = (Statement)con.createStatement();
            
            if(stmt.execute(query)){
                rs = stmt.getResultSet();
                while(rs.next()){
                    Cajero tempcaj = new Cajero(rs.getInt("IdCajero"), rs.getDouble("Sueldo"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getString("Direccion"), rs.getLong("Telefono"),
                                                 rs.getString("Correo"), rs.getInt("Cedula"), rs.getString("Contrasena"));
                    contrCaj.insertar(tempcaj);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
        }
        
    }   

    public void insertarAdmin(Administrador admin){
        
        String statement = "INSERT INTO ADMINISTRADOR "
                         + "VALUES("+admin.getCedula()+","
                         +"'"+admin.getNombre()+"'"+","
                         +"'"+admin.getApellido()+"'"+","
                         +"'"+admin.getDireccion()+"'"+","
                         +admin.getTelefono()+","
                         +"'"+admin.getCorreo()+"'"+","
                         +"'"+admin.getContrasena()+"'"+","
                         +admin.getIdAdmin()+");";
    
//        Statement stmt = null;
        try {
            Statement stmt = (Statement)con.createStatement();
            stmt.executeUpdate(statement);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
            ex.printStackTrace();
        }
        
    }


    public void insertarCuentaCorr(CuentaCorriente cuenta){
        
        String statement = "INSERT INTO CUENTA_AHORROS "
                            +"VALUES('"+cuenta.getIdCuentaCorriente()+"'"
                            +","+cuenta.getSaldoCuentaCorriente()+","
                            + cuenta.getIdCliente()+");";
    
//        Statement stmt = null;
        try {
            Statement stmt = (Statement)con.createStatement();
            stmt.executeUpdate(statement);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
        }
        
        
    }
    
    
    public void insertarCuentaAho(CuentaAhorros cuenta){
        String statement = "INSERT INTO CUENTA_AHORROS "
                            +"VALUES('"+cuenta.getIdCuentaAhorros()+"'"
                            +","+cuenta.getSaldoCuentaAhorros()+","
                            + cuenta.getIdCliente()+");";
        
//        Statement stmt = null;
        try {
            Statement stmt = (Statement)con.createStatement();
            stmt.executeUpdate(statement);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
        }
    }
    
    public void insertarCliente(Cliente cli){
        
        String statement = "INSERT INTO CLIENTE "
                         + "VALUES("+cli.getCedula()+","
                         +"'"+cli.getNombre()+"'"+","
                         +"'"+cli.getApellido()+"'"+","
                         +"'"+cli.getDireccion()+"'"+","
                         +cli.getTelefono()+","
                         +"'"+cli.getCorreo()+"'"+","
                         +"'"+cli.getContrasena()+"');";
    
//        Statement stmt = null;
        try {
            Statement stmt = (Statement)con.createStatement();
            stmt.executeUpdate(statement);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
        }   
    }
    
    
    public void insertarCajero(Cajero caj){
        
        String statement = "INSERT INTO CAJERO "
                         + "VALUES("+caj.getCedula()+","
                         +"'"+caj.getNombre()+"'"+","
                         +"'"+caj.getApellido()+"'"+","
                         +"'"+caj.getDireccion()+"'"+","
                         +caj.getTelefono()+","
                         +"'"+caj.getCorreo()+"'"+","
                         +"'"+caj.getContrasena()+"'"+","
                         +caj.getIdCajero()+","
                         +caj.getSueldo()+");";
    
//        Statement stmt = null;
        try {
            Statement stmt = (Statement)con.createStatement();
            stmt.executeUpdate(statement);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
        }
        
        
    }
    

     public void eliminarCuentaCorr(CuentaCorriente cuenta){
        String statement = "DELETE FROM CUENTA_CORRIENTE WHERE "+"IdCuenta = "+"'"+cuenta.getIdCuentaCorriente()+"'";
    
        Statement stmt = null;
        try {
            stmt = (Statement)con.createStatement();
            stmt.executeUpdate(statement);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
        }  
    }
    
    public void eliminarCuentaAho(CuentaAhorros cuenta){
        String statement = "DELETE FROM CUENTA_AHORROS WHERE "+"IdCuenta = "+"'"+cuenta.getIdCuentaAhorros()+"'";
    
        Statement stmt = null;
        try {
            stmt = (Statement)con.createStatement();
            stmt.executeUpdate(statement);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
        }  
    }
    
    
    public void eliminarCliente(Cliente cli){
        String statement = "DELETE FROM CLIENTE WHERE "+"Cedula = "+cli.getCedula();
    
        Statement stmt = null;
        try {
            stmt = (Statement)con.createStatement();
            stmt.executeUpdate(statement);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
        }  
    }
    
    public void eliminarAdmin(Administrador admin){
        String statement = "DELETE FROM ADMINISTRADOR WHERE "+"Cedula = "+admin.getCedula();
    
        Statement stmt = null;
        try {
            stmt = (Statement)con.createStatement();
            stmt.executeUpdate(statement);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
        }  
    }
    
    public void eliminarCajero(Cajero caj){
        String statement = "DELETE FROM CAJERO WHERE "+"Cedula = "+caj.getCedula();
    
        Statement stmt = null;
        try {
            stmt = (Statement)con.createStatement();
            stmt.executeUpdate(statement);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
        }  
    }
    
    public void modificarCliente(Cliente cli){
        
        String statement = "UPDATE CLIENTE"
                          + " SET Nombre = "+"'"+cli.getNombre()+"'"+", Apellido = "+"'"+cli.getApellido()+"'"+", Direccion = "+"'"+cli.getDireccion()+"'"+
                          ", Telefono = "+cli.getTelefono()+", Correo = "+"'"+cli.getCorreo()+"'"+", Contrasena = "+"'"+cli.getContrasena()+"'"+
                          " WHERE Cedula = "+cli.getCedula()+";";
        
        Statement stmt = null;
        
        try{
            stmt = (Statement)con.createStatement();
            stmt.executeUpdate(statement);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
            ex.printStackTrace();
        }
    }
    
    
    public void modificarCajero(Cajero caj){
        String statement = "UPDATE CAJERO"
                          + " SET Nombre = "+"'"+caj.getNombre()+"'"+", Apellido = "+"'"+caj.getApellido()+"'"+", Direccion = "+"'"+caj.getDireccion()+"'"+
                          ", Telefono = "+caj.getTelefono()+", Correo = "+"'"+caj.getCorreo()+"'"+", Contrasena = "+"'"+caj.getContrasena()+"'"+", Sueldo ="+"'"+caj.getSueldo()+"'"+
                          ", IdCajero = "+caj.getIdCajero()+  " WHERE Cedula = "+caj.getCedula()+";";
        
        Statement stmt = null;
        
        try{
            stmt = (Statement)con.createStatement();
            stmt.executeUpdate(statement);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
            ex.printStackTrace();
        }
        
    }
        public void modificarAdministrador(Administrador admin){
        String statement = "UPDATE ADMINISTRADOR"
                          + " SET Nombre = "+"'"+admin.getNombre()+"'"+", Apellido = "+"'"+admin.getApellido()+"'"+", Direccion = "+"'"+admin.getDireccion()+"'"+
                          ", Telefono = "+admin.getTelefono()+", Correo = "+"'"+admin.getCorreo()+"'"+", Contrasena = "+"'"+admin.getContrasena()+"'"+
                          ", IdAdmin = "+admin.getIdAdmin()+  " WHERE Cedula = "+admin.getCedula()+";";
        
        Statement stmt = null;
        
        try{
            stmt = (Statement)con.createStatement();
            stmt.executeUpdate(statement);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
            ex.printStackTrace();
        }
        
    }
        
    public void modificarCuentaAho(CuentaAhorros cuenta){
    
        String statement = "UPDATE CUENTA_AHORROS SET Saldo = "+"'"+cuenta.getSaldoCuentaAhorros()+"'"+" WHERE IdCuenta = "+cuenta.getIdCuentaAhorros()+";";
        
        Statement stmt = null;
        
        try{
            stmt = (Statement)con.createStatement();
            stmt.executeUpdate(statement);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
            ex.printStackTrace();
        }   
    }
    
    
    public void modificarCuentaCorr(CuentaCorriente cuenta){
    
        String statement = "UPDATE CUENTA_CORRIENTE SET Saldo = "+"'"+cuenta.getSaldoCuentaCorriente()+"'"+" WHERE IdCuenta = "+cuenta.getIdCuentaCorriente()+";";
        
        Statement stmt = null;
        
        try{
            stmt = (Statement)con.createStatement();
            stmt.executeUpdate(statement);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Problemas al conectarse con la base de datos");
            ex.printStackTrace();
        }   
    }
    
    
    
}







