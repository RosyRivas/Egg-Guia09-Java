
package guia09java.pkg01.modelo;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Persona {
    
    private String nombre;
    private String apellido;
    private String edad;
    private String dni;
     private ArrayList<Perro> mascota =new ArrayList();

    public Persona(String nombre, String apellido, String edad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
       
    }

    public Persona() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Perro> getMascota() {
        return mascota;
    }

    public void setMascota(ArrayList<Perro> mascota) {
        this.mascota = mascota;
    }



    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", mascota=" + mascota + '}';
    }
    public void ingresarPersona(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el nombre de la persona");
        this.nombre = leer.next();
        System.out.println("ingrese el apellido de la persona");
        this.apellido = leer.next();
        System.out.println("ingrese la edad de la persona");
        this.edad = leer.next();
        System.out.println("ingrese el dni de la persona");
        this.dni = leer.next();
        
    
    }
    
    
    public void adoptaPerro(Perro perro){
      
        this.mascota.add(perro);
    
    }
    
    public void visualizarPersona(){
        System.out.println("Nombre:"+this.getNombre());
        System.out.println("Apellido: "+this.getApellido());
        System.out.println("Dni: "+this.getDni());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("lista de perros adoptados");
         for (Perro perro: mascota) {
            System.out.println(perro.toString());
        }
    
    }
    
    
}
