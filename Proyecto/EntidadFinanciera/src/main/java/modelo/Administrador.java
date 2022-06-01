/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rafael
 */
public class Administrador extends Usuario implements Comparable<Administrador>{
    private int idAdmin;
    
    public Administrador(int idAdmin, String nombre, String apellido, String direccion, int telefono, String correo, int cedula) {
        super(nombre, apellido, direccion, telefono, correo, cedula);
        this.idAdmin = idAdmin;
    }

    public Administrador(int idAdmin, String nombre, String apellido, String direccion, long telefono, String correo, int cedula, String contrasena) {
        super(nombre, apellido, direccion, telefono, correo, cedula, contrasena);
        this.idAdmin = idAdmin;
    }
    
    
    public Administrador() {
    }

    public Administrador(int cedula, String contrasena) {
        super(cedula, contrasena);
    }
    
    
    
    public Administrador(Administrador another){
        this.nombre = another.nombre;
        this.apellido = another.apellido;
        this.direccion = another.direccion;
        this.telefono = another.telefono;
        this.correo = another.correo;
        this.cedula = another.cedula;
        this.idAdmin = another.idAdmin;
        this.contrasena = another.contrasena;
    }
    
    
    @Override
    public int compareTo(Administrador c){
        return (this.getCedula() < c.getCedula()? -1:
                (this.getCedula() == c.getCedula()? 0 : 1));
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }
    
    
    
}
