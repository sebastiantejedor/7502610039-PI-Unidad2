package Taller6.Ejercicio1;

public class Main {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Santiago", 1800000);

        System.out.println("Información del empleado:");
        empleado.mostrarInformacion();

        System.out.println();

        Gerente gerente = new Gerente(
                "Sebas",
                6500000,
                "equipo de Marketing"
        );

        System.out.println("Información del gerente:");
        gerente.mostrarInformacion();
    }
}
