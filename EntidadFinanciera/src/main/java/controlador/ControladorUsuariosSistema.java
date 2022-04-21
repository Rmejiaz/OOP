/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Administrador;

/**
 *
 * @author rafael
 */
public class ControladorUsuariosSistema {
    Administrador admin = new Administrador(123, "Admin123");
    
    public boolean autenticar(int idUsuario, String contrasena){
        if(admin.getCedula() == idUsuario && admin.getContrasena().equals(contrasena))
            return true;
        else
            return false;
    }
    
}
