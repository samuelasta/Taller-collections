package Taller.punto6;

public class Productos implements Comparable<Productos>{

    private String codigo;
    private String nombre;
    private double precio;
    private int cantidadProductos;

    public Productos(String codigo, String nombre, double precio, int cantidadProductos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadProductos = cantidadProductos;
    }

    @Override
    public int compareTo(Productos o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public String toString(){
        return "codigo: "+ codigo+ " producto: "+ nombre+ " precio: "+precio+ " stock: "+ cantidadProductos;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setNumeroProductos(int numeroProductos) {
        this.cantidadProductos = numeroProductos;
    }


}
