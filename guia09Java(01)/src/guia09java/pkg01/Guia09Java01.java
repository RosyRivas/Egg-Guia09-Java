package guia09java.pkg01;

import guia09java.pkg01.modelo.Perro;
import guia09java.pkg01.modelo.Persona;

public class Guia09Java01 {

    public static void main(String[] args) {
        Perro perro = new Perro("manchita", "caniche", "2", "chico");
        Perro perro1 = new Perro("colo", "Pastor aleman", "5", "grande");

        Persona persona = new Persona();
        persona.setNombre("Martina");
        persona.setApellido("Flores");
        persona.setEdad("24");
        persona.setDni("40195263");

        persona.setMascota(perro);
        System.out.println(persona.toString());
        
        Persona persona1 = new Persona();
        persona1.setNombre("Alberto");
        persona1.setApellido("Gimenez");
        persona1.setEdad("50");
        persona1.setDni("20198265");

        persona1.setMascota(perro1);
        System.out.println(persona1.toString());
    }

}
