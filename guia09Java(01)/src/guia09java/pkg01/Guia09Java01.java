package guia09java.pkg01;

import guia09java.pkg01.modelo.Perro;
import guia09java.pkg01.modelo.Persona;

public class Guia09Java01 {

    public static void main(String[] args) {
        Perro perro = new Perro("manchita", "caniche", "2", "chico");
        Perro perro1 = new Perro("colo", "Pastor aleman", "5", "grande");

       Persona persona = new Persona();   
        persona.ingresarPersona();
        persona.adoptaPerro(perro);
        persona.visualizarPersona();
        
        Persona persona1 = new Persona();
        persona1.setNombre("Alberto");
        persona1.setApellido("Gimenez");
        persona1.setEdad("50");
        persona1.setDni("25598265");
        persona1.adoptaPerro(perro1);
        persona1.visualizarPersona();
       
    }

}
