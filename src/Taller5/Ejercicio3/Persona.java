package Taller5.Ejercicio3;

public class Persona {

    private String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

/*
private es más restrictivo porque solamente permite
acceso dentro de la misma clase,
mientras que default permite acceso dentro de todas
las clases que pertenezcan al mismo paquete.
 */