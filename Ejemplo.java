import java.util.ArrayList;

public class Usuario
{
    //Atributos sin modificadores
    //Por convención comienzan con letras minúsculas
    // Variables de instancia de clase pueden ser tipos básicos
    // Pueder ser clases - Api de Java - Pueden ser de clases definidas por el usuario
    String nombre;
    String correo;
    String nickname;
    String contrasena;
    int id;
    
    // El constructor de la clase por defecto es un constructor vacio
    // Es un metodo que no retorna nada con el mismo nombre de la clase
   
    // Metodo toString
    @Override
    public String toString()
    {
        return nombre + "-"+nickname;
    }
    public static void main(String[] args){
        //Instancia de una clase
        // El comportamiento de la clase se accede a través de los objetos
        // Los métodos definen el comportamiento de la clase
        // Nombre de la clase objeto que manipula atributos y métodos
        // = la palabra new separa memoria y el constructor
        Usuario objUsu1 = new Usuario();
        
        // Instancia de una clase de la API de Java
        // NOmbre de
        
        Usuario []arregloUsu = new Usuario[8];
        
        // instancia de una clase de la API de java
        // NOmbre de la clase objeto = new y el constructor
        
        ArrayList<Usuario> objArregloDin = new ArrayList<Usuario>();
        
        objUsu1.nombre = "Rafael";
        objUsu1.correo = "rmejiaz@unal.edu.co";
        objUsu1.nickname = "rmejiaz";
        objUsu1.contrasena = "1234";
        
        arregloUsu[0] = objUsu1;
        
        objUsu1 = new Usuario();

        objUsu1.nombre = "Pepe";
        objUsu1.correo = "pepe@unal.edu.co";
        objUsu1.nickname = "pepito";
        objUsu1.contrasena = "1234"; 
        
        
        objArregloDin.add(objUsu1);
        
        arregloUsu[1] = objUsu1;
        for(int i = 0; i<2; i++)
            System.out.println("Usu"+ arregloUsu[i].toString());
        
        for(int i = 0; i<objArregloDin.size(); i++)
            System.out.println("Usu"+ objArregloDin.get(i).toString());
        
        
    }
  
}//final de la  clase