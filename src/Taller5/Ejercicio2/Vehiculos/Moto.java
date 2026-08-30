package Taller5.Ejercicio2.Vehiculos;

public class Moto extends Vehiculo {

    public Moto(String tipo) {
        super(tipo);
    }

    public void mostrarInformacion() {
        System.out.println("La moto es de tipo: " + tipo);
        mostrarTipo();
    }
}