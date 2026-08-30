package Taller5.Ejercicio2.Prueba;
import Taller5.Ejercicio2.Vehiculos.Moto;

public class Main {
    public static void main(String[] args) {

        Moto moto = new Moto("Deportiva");
        moto.mostrarInformacion();

        /*
        Estas líneas producirían errores:

        System.out.println(moto.tipo);
        moto.mostrarTipo();
         */
    }
}

