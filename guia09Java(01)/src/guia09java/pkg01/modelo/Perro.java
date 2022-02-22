
package guia09java.pkg01.modelo;

import java.util.Locale;
import java.util.Scanner;


public class Perro {
    private String nombre;
    private String  raza;
    private String edad;
    private String tamaño;
   

    public Perro() {
    }

    public Perro(String nombre, String raza, String edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tama\u00f1o=" + tamaño + '}';
    }
    
    public void crearPerro(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese nombre de mascota");
        this.nombre =leer.next();
        System.out.println("ingrese la raza del perro");
        this.raza=leer.next();
        System.out.println("ingrese edad del perro");
        this.edad=leer.next();
        System.out.println("ingerse el tamaño del perro");
        this.tamaño=leer.next();
    }
   
}
