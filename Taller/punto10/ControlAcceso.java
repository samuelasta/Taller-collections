package Taller.punto10;

import java.util.HashSet;

public class ControlAcceso {
    private HashSet<String> empleadosAutorizados;

    public ControlAcceso() {
        empleadosAutorizados = new HashSet<>();
    }

    // Registrar un nuevo empleado en el sistema (no permite duplicados)
    public void registrarEmpleado(String idEmpleado) {
        if (empleadosAutorizados.add(idEmpleado)) {
            System.out.println("Empleado registrado: " + idEmpleado);
        } else {
            System.out.println("El empleado con ID " + idEmpleado + " ya está registrado.");
        }
    }

    // Verificar si un empleado tiene acceso al edificio
    public void verificarAcceso(String idEmpleado) {
        if (empleadosAutorizados.contains(idEmpleado)) {
            System.out.println("Acceso permitido para el empleado: " + idEmpleado);
        } else {
            System.out.println("Acceso denegado. El empleado con ID " + idEmpleado + " no está registrado.");
        }
    }

    // Mostrar todos los empleados registrados
    public void mostrarEmpleados() {
        System.out.println("Empleados autorizados: " + empleadosAutorizados);
    }

    public static void main(String[] args) {
        ControlAcceso acceso = new ControlAcceso();

        acceso.registrarEmpleado("empleado 1");
        acceso.registrarEmpleado("empleado 2");
        acceso.registrarEmpleado("empleado 3");

        acceso.mostrarEmpleados();

        acceso.verificarAcceso("empleado 1"); // permitido
        acceso.verificarAcceso("empleado 4"); // denegado

        acceso.registrarEmpleado("empleado 3"); // intento de duplicado
        acceso.mostrarEmpleados();
    }
}

