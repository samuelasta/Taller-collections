package Taller.punto12;

import java.util.TreeSet;

public class Universidad {
    
    TreeSet<Estudiante> estudiantes;

    public Universidad() {
        this.estudiantes = new TreeSet<>();
    }

    public void agregarEstudiante(Estudiante e){
        estudiantes.add(e);
        System.out.println("estudiante agregado con exito");
    }

    public void mostrarEstudiantes(){
        for(Estudiante e: estudiantes){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Universidad universidad = new Universidad();

        Estudiante estudiante1 = new Estudiante("robinson");
        Estudiante estudiante2 = new Estudiante("samuel");
        Estudiante estudiante3 = new Estudiante("miguel");

        universidad.agregarEstudiante(estudiante1);
        universidad.agregarEstudiante(estudiante2);
        universidad.agregarEstudiante(estudiante3);

        universidad.mostrarEstudiantes();
    }
}
