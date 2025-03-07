package Taller.punto4;

public class Tarea implements Comparable<Tarea>{
    
    private String trabajos;
    private int prioridad;
    
    public Tarea(String trabajos, int prioridad) {
        this.trabajos = trabajos;
        this.prioridad = prioridad;
    }

    public String getTrabajos() {
        return trabajos;
    }

    public void setTrabajos(String trabajos) {
        this.trabajos = trabajos;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Tarea o) {
        return Integer.compare(this.prioridad, o.prioridad);
    }
    @Override
    public String toString(){
        return "tarea: "+ trabajos + " con prioridad: "+ prioridad;
    }
   
}
