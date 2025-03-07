package punto16;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supermercado supermercado = new Supermercado();
        int opcion;
        do {
            System.out.println("\n--- Supermercado ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Ver carrito de compras");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    supermercado.agregarProducto(nombre, precio);
                    break;
                case 2:
                    supermercado.mostrarCarrito();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 3);
        scanner.close();
    }
}
