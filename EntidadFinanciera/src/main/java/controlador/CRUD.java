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
    // Todos los metodos son abstractos
    // La clase que implemente esa interface tiene que 
    // escribir el comportamiento de los metodos
    public boolean insertar(Object obj);
    public boolean  modificar(Object obj_old, Object obj_new);
    public boolean borrar(Object obj);
    public Object  consultarUno(Object obj);
    public void    consultarTodos();
    public void    ordenar();
    public void    quicksort(int izq, int der);
}
