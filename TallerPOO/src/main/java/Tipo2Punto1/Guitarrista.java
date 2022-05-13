/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo2Punto1;

/**
 *
 * @author rafael
 */
public class Guitarrista extends Persona implements MusicPlayer{
    private Guitarra gui = new Guitarra();

    public Guitarrista(String nombre, String apellido, String direccion, String correo, String telefono, int cedula) {
        super(nombre, apellido, direccion, correo, telefono, cedula);
    }

    public Guitarrista() {
    }

    @Override
    public Instrumento getInstrumento() {
        return (Instrumento)gui;
    }
    
    @Override
    public void setInstrumento(Instrumento ins) {
        this.gui = (Guitarra) ins;
    }

}
