package punto13;

import java.util.PriorityQueue;
import java.util.Scanner;

class Paciente implements Comparable<Paciente> {
    private String nombre;
    private int prioridad;

    public Paciente(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Paciente otro) {
        return Integer.compare(otro.prioridad, this.prioridad); // Orden descendente de prioridad
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre + " - Prioridad: " + prioridad;
    }
}

