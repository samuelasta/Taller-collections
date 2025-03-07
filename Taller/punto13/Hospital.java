package Taller.punto13;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Hospital {
    private PriorityQueue<Paciente> colaPacientes;

    public Hospital() {
        colaPacientes = new PriorityQueue<>();
    }

    public void ingresarPaciente(String nombre, int prioridad) {
        colaPacientes.add(new Paciente(nombre, prioridad));
        System.out.println("Paciente ingresado correctamente.");
    }

    public void atenderPaciente() {
        if (colaPacientes.isEmpty()) {
            System.out.println("No hay pacientes en espera.");
        } else {
            System.out.println("Atendiendo a: " + colaPacientes.poll());
        }
    }

    public void mostrarPacientes() {
        if (colaPacientes.isEmpty()) {
            System.out.println("No hay pacientes en la cola.");
            return;
        }
        System.out.println("\n--- Pacientes en espera ---");
        for (Paciente p : colaPacientes) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();
        int opcion;
        do {
            System.out.println("\n--- Sistema de Gestion de Pacientes ---");
            System.out.println("1. Ingresar paciente");
            System.out.println("2. Atender paciente");
            System.out.println("3. Ver lista de pacientes en espera");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del paciente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la prioridad (1 - Baja, 10 - Alta): ");
                    int prioridad = scanner.nextInt();
                    hospital.ingresarPaciente(nombre, prioridad);
                    break;
                case 2:
                    hospital.atenderPaciente();
                    break;
                case 3:
                    hospital.mostrarPacientes();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}
