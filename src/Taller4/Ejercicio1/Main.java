package Taller4.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Sebas", 17, 4.5);

        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Nota promedio: " + estudiante1.getNotaPromedio());

        estudiante1.setNombre("Sebastián");
        estudiante1.setEdad(18);
        estudiante1.setNotaPromedio(4.8);

        System.out.println("\nDatos actualizados:");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Nota promedio: " + estudiante1.getNotaPromedio());

        estudiante1.setEdad(-5);
        estudiante1.setNotaPromedio(7);
    }
}
