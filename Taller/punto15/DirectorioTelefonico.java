package punto15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DirectorioTelefonico {
    private HashMap<String, String> contactos;

    public DirectorioTelefonico() {
        contactos = new HashMap<>();
    }

    public void agregarContacto(String nombre, String numero) {
        if (contactos.containsValue(numero)) {
            System.out.println("El numero ya esta registrado con otro contacto.");
        } else {
            contactos.put(nombre, numero);
            System.out.println("Contacto agregado correctamente.");
        }
    }

    public void buscarPorNombre(String nombre) {
        if (contactos.containsKey(nombre)) {
            System.out.println("Numero de " + nombre + ": " + contactos.get(nombre));
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    public void buscarPorNumero(String numero) {
        for (Map.Entry<String, String> contacto : contactos.entrySet()) {
            if (contacto.getValue().equals(numero)) {
                System.out.println("Contacto encontrado: " + contacto.getKey() + " - " + contacto.getValue());
                return;
            }
        }
        System.out.println("Numero no encontrado en el directorio.");
    }

    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("El directorio esta vacio.");
            return;
        }
        System.out.println("\n--- Directorio Telefonico ---");
        for (Map.Entry<String, String> contacto : contactos.entrySet()) {
            System.out.println(contacto.getKey() + " - " + contacto.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DirectorioTelefonico directorio = new DirectorioTelefonico();
        int opcion;
        do {
            System.out.println("\n--- Directorio Telefonico ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto por nombre");
            System.out.println("3. Buscar contacto por numero");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el numero de telefono: ");
                    String numero = scanner.nextLine();
                    directorio.agregarContacto(nombre, numero);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre a buscar: ");
                    String buscarNombre = scanner.nextLine();
                    directorio.buscarPorNombre(buscarNombre);
                    break;
                case 3:
                    System.out.print("Ingrese el numero a buscar: ");
                    String buscarNumero = scanner.nextLine();
                    directorio.buscarPorNumero(buscarNumero);
                    break;
                case 4:
                    directorio.mostrarContactos();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 5);
        scanner.close();
    }
}

