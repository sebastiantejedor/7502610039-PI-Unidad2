package Taller4.Ejercicio3;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Sebas");

        System.out.println(persona1.getNombre());

        persona1.setNombre("Carlos");

        System.out.println(persona1.getNombre());
    }
}


/*
public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Sebas");

        Esto genera un error:
        persona1.nombre = "Carlos";
    }
}
 */