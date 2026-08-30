package Taller4.Ejercicio2;

public class Main {

    public static void main(String[] args) {

        Coche coche1 = new Coche("Toyota", "Corolla", 180);

        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());
        System.out.println("Velocidad máxima: " + coche1.getVelocidadMaxima());

        coche1.acelerar(20);

        System.out.println("Nueva velocidad máxima: " + coche1.getVelocidadMaxima());

        coche1.acelerar(-10);

        //coche1.velocidadMaxima = 300;
    }
}