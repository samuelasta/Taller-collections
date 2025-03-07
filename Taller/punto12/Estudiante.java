package Taller.punto12;

public class Estudiante implements Comparable<Estudiante>{
    
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String toString(){
        return nombre;
    }
    @Override
    public int compareTo(Estudiante o) {
        return this.nombre.compareTo(o.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
