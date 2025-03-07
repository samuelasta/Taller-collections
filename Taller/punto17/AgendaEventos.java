package punto17;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AgendaEventos {
    private TreeMap<LocalDate, String> eventos;

    public AgendaEventos() {
        eventos = new TreeMap<>();
    }

    public void agregarEvento(LocalDate fecha, String descripcion) {
        eventos.put(fecha, descripcion);
    }

    public void mostrarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("No hay eventos en la agenda");
            return;
        }
        for (Map.Entry<LocalDate, String> evento : eventos.entrySet()) {
            System.out.println(evento.getKey() + " - " + evento.getValue());
        }
    }

    public void obtenerProximoEvento() {
        if (eventos.isEmpty()) {
            System.out.println("No hay eventos proximos");
        } else {
            Map.Entry<LocalDate, String> proximo = eventos.firstEntry();
            System.out.println("Proximo evento: " + proximo.getKey() + " - " + proximo.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendaEventos agenda = new AgendaEventos();
        int opcion;
        do {
            System.out.println("\n--- Agenda de Eventos ---");
            System.out.println("1. Agregar evento");
            System.out.println("2. Mostrar eventos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la fecha del evento (ANIO-MM-DD): ");
                    LocalDate fecha = LocalDate.parse(scanner.nextLine());
                    System.out.print("Ingrese la descripcion del evento: ");
                    String descripcion = scanner.nextLine();
                    agenda.agregarEvento(fecha, descripcion);
                    System.out.println("Evento agregado correctamente.");
                    break;
                case 2:
                    agenda.mostrarEventos();
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


