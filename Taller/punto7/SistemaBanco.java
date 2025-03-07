package Taller.punto7;

import java.util.LinkedList;

public class SistemaBanco {
    private LinkedList<String> colaClientes;

    public SistemaBanco() {
        colaClientes = new LinkedList<>();
    }

    //agrega cliente a la cola 
    public void agregarCliente(String nombre) {
        colaClientes.addLast(nombre);
        System.out.println("cliente agregado: " + nombre);
    }

    //atiende al primer cliente en la cola
    public void atenderCliente() {
        if (!colaClientes.isEmpty()) {
            String clienteAtendido = colaClientes.removeFirst();
            System.out.println("se esta atendiendo a: " + clienteAtendido);
        } else {
            System.out.println("o hay clientes en la cola");
        }
    }

    //inserta el cliente con urgencia al inicio de la cola
    public void agregarClienteUrgente(String nombre) {
        colaClientes.addFirst(nombre);
        System.out.println("cliente urgente agregado al inicio: " + nombre);
    }

    public void mostrarCola() {
        System.out.println("cola de espera: " + colaClientes);
    }

    public static void main(String[] args) {
        SistemaBanco banco = new SistemaBanco();

        banco.agregarCliente("samuel");
        banco.agregarCliente("miguel");
        banco.agregarCliente("Carlos");

        banco.mostrarCola();

        banco.agregarClienteUrgente("sofia"); // es el cliente urgente
        banco.mostrarCola();

        banco.atenderCliente();
        banco.mostrarCola();

        banco.atenderCliente();
        banco.mostrarCola();
    }
}
