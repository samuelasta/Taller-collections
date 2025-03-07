package Taller.punto1;

import java.util.TreeSet;

public class Empresa { //Crear la lista de productos en una clase empresa utilizando treeset, se debe realizar
    //un método que busque un producto por su código.
    
     private static TreeSet<Productos> list= new TreeSet<>();
        
        public static boolean buscarProducto(TreeSet <Productos> list, int codigo){
    
            for(Productos p : list){
                if(p.getCodigo()== codigo){
                    return true;
                }
            }
            return false;
        }
        public void agregarProductos(Productos producto){
            list.add(producto);
        }
    
        public static void main(String[] args) {
            
            Empresa empresa = new Empresa();
            Productos prod1 = new Productos(1, "jabon");
            Productos prod2 = new Productos(2, "shampoo");
            Productos prod3 = new Productos(3, "acondicionador");
    
            empresa.agregarProductos(prod3);
            empresa.agregarProductos(prod2);
            empresa.agregarProductos(prod1);
    
            if (buscarProducto(list, 3)== true) {
            System.out.println("se encontró el producto");
        }
        else{
            System.out.println("no se encontró el objeto");
        }
        
    }

}
