package Taller.punto5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class ListasEj {
    
    public static void main(String[] args) {
        HashMap <Integer, String> productos = new HashMap<>();
        LinkedHashMap <Integer, String> productos2 = new LinkedHashMap<>();
        TreeMap <Integer, String> productos3 = new TreeMap<>();

        productos.put(2, "moto");
        productos.put(1, "carro");
        productos.put(3, "avion");
        productos2.put(2, "moto");
        productos2.put(1, "carro");
        productos2.put(3, "avion");
        productos3.put(2, "moto");
        productos3.put(1, "carro");
        productos3.put(3, "avion");

        System.out.println(productos);
        System.out.println(productos2);
        System.out.println(productos3);
//en el hashmap se agrega el producto y no se tiene ningun orden osea que al imprimir puede imprimir en desorden o no
//en el LinkedHashMap se agrega el producto y se conserva su orden de inserción
//en el TreeMap se agrega el producto y el lo ordena con base a la clave ascendentemente o uno lo puede modificar


    }
}
