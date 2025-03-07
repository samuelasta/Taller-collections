package punto16;

import java.util.LinkedHashMap;


class Supermercado {
    private LinkedHashMap<String, Producto> carrito;

    public Supermercado() {
        carrito = new LinkedHashMap<>();
    }

    public void agregarProducto(String nombre, double precio) {
        Producto producto = new Producto(nombre, precio);
        carrito.put(nombre, producto);
        System.out.println("Producto agregado al carrito.");
    }

    public void mostrarCarrito() {
        if (carrito.isEmpty()) {
            System.out.println("El carrito esta vacio.");
            return;
        }
        System.out.println("\n--- Carrito de Compras ---");
        for (Producto producto : carrito.values()) {
            System.out.println(producto);
        }
        System.out.println("Total: $" + calcularTotal());
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : carrito.values()) {
            total += producto.getPrecio();
        }
        return total;
    }
}
