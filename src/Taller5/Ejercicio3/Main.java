package Taller5.Ejercicio3;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona("Sebas", 17);

        System.out.println("Edad: " + persona.edad);

        System.out.println("Nombre: " + persona.getNombre());

        persona.setNombre("Sebastián");

        System.out.println("Nuevo nombre: " + persona.getNombre());

        persona.edad = 18;

        System.out.println("Nueva edad: " + persona.edad);
    }
}