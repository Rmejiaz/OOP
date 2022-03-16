/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlador;

/**
 *
 * @author rafael
 */

/*
CRUD
Create - Insertar o crear datos
Read   - Leer u obtener datos
Update - Modificar o actualizar datos
Delete - Borrar datos

Interfaz - Es una clase donde TODOS los métodos son abstractos - solo tienen la firma
           las clases que la implementen deben colocar el comportamiento o la funcionalidad del método
*/
public interface CRUD {
    public boolean insertar(Object obj);
    public Object  modificar(Object obj);
    public boolean borrar(Object obj);
    public Object consultarUno(Object obj);
}
