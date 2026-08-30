package Taller5.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Producto producto = new Producto("Laptop", 2500000, 10);

        System.out.println("Nombre: " + producto.nombre);
        System.out.println("Precio: $" + producto.precio);
        System.out.println("Stock: " + producto.stock);

        producto.mostrarInfo();
    }
}
