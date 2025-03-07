package Taller.punto1;

public class Productos implements Comparable<Productos>{
    
    private int codigo;
    private String nombre;

    
    public Productos(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public int compareTo(Productos o) {
        
        return Integer.compare(this.codigo, o.codigo);
    }

    
}
