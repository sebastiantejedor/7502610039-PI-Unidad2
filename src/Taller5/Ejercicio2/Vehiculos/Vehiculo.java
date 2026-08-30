package Taller5.Ejercicio2.Vehiculos;

public class Vehiculo {
    String tipo;

    Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    void mostrarTipo() {
        System.out.println("Tipo: " + tipo);
    }
}
