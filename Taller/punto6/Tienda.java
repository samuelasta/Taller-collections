package Taller.punto6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class Tienda {
    ArrayList <Productos> productos = new ArrayList<>();
    ;

    public Tienda() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Productos p){
        productos.add(p);
        ordenarProductos();
    }
    
    public void eliminarAgotados(){
        Iterator <Productos> iterator = productos.iterator();

        while(iterator.hasNext()){
            Productos aux = iterator.next();
            if(aux.getCantidadProductos()==0){
                iterator.remove();
            }
        }
    }
    
    public void imprimirProductos(){
        if(productos.isEmpty() == true){
            System.out.println("no hay ningun producto");
        }
        else{
            Collections.sort(productos);
            for(Productos p : productos){
                System.out.println(p);
            }
        }
    }
    public void buscarProducto(String codigo){
        Boolean aux = false;
        for (Productos p: productos) {
            if(p.getCodigo().equals(codigo)){
                System.out.println("producto encontrado");
                aux = true;
            }    
        }   
        if(aux == false){
            System.out.println("producto no encontrado");
        }
    }
    public void ordenarProductos() {
        productos.sort(new Comparator<Productos>() {
            @Override
            public int compare(Productos o1, Productos o2) {
                int resultado = o1.getNombre().compareTo(o2.getNombre());
                if (resultado == 0) {
                    return Double.compare(o1.getPrecio(), o2.getPrecio());
                }
                return resultado;
            }
        });
    }
    public static void main(String[] args) {
        Tienda inventario = new Tienda();
        Productos prod1 = new Productos("1", "gaseosa", 5000, 3);
        Productos prod2 = new Productos("12", "papas", 3000, 0);
        Productos prod3 = new Productos("123", "chiclets", 2000, 3);
        Productos prod4 = new Productos("1234", "chiclets", 500, 3);

        inventario.agregarProducto(prod1);
        inventario.agregarProducto(prod2);
        inventario.agregarProducto(prod3);
        inventario.agregarProducto(prod4);

        inventario.imprimirProductos();//imprime los 4 productos ya ordenados
        inventario.eliminarAgotados();//eliminara uno que tiene stock 0
        inventario.imprimirProductos();//ya imprime solo 3 porque eliminamos 1
        inventario.buscarProducto("12");//no lo va a encontrar porque lo eliminamos

        }


    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }



}
