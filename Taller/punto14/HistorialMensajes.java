package punto14;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class HistorialMensajes {
    private Deque<String> mensajes;
    private static final int LIMITE = 10;

    public HistorialMensajes() {
        mensajes = new ArrayDeque<>();
    }

    public void agregarMensaje(String mensaje) {
        if (mensajes.size() == LIMITE) {
            mensajes.pollFirst(); // Elimina el mensaje mas antiguo si el limite se ha alcanzado
        }
        mensajes.addLast(mensaje);
    }

    public void mostrarHistorial() {
        if (mensajes.isEmpty()) {
            System.out.println("No hay mensajes en el historial.");
            return;
        }
        System.out.println("\n--- Ultimos mensajes enviados ---");
        for (String mensaje : mensajes) {
            System.out.println(mensaje);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HistorialMensajes historial = new HistorialMensajes();
        int opcion;
        do {
            System.out.println("\n--- Aplicacion de Mensajeria ---");
            System.out.println("1. Enviar mensaje");
            System.out.println("2. Ver historial de mensajes");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese su mensaje: ");
                    String mensaje = scanner.nextLine();
                    historial.agregarMensaje(mensaje);
                    System.out.println("Mensaje enviado.");
                    break;
                case 2:
                    historial.mostrarHistorial();
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
