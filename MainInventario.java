
import java.util.ArrayList;

// Clase que representa un producto
class Producto {
    private final String nombre;
    private final double precio;
    private final int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Precio: " + precio + ", Cantidad: " + cantidad;
    }
}

// Clase Inventario con métodos sobrecargados
class Inventario {
    private final ArrayList<Producto> productos = new ArrayList<>();

    // Método 1: solo nombre
    public void agregarProducto(String nombre) {
        productos.add(new Producto(nombre, 0.0, 0));
        System.out.println("Producto agregado: " + nombre + " (sin precio ni cantidad)");
    }

    // Método 2: nombre y precio
    public void agregarProducto(String nombre, double precio) {
        if (precio < 0) {
            System.out.println("Error: el precio no puede ser negativo.");
            return;
        }
        productos.add(new Producto(nombre, precio, 0));
        System.out.println("Producto agregado: " + nombre + " | Precio: " + precio);
    }

    // Método 3: nombre, precio y cantidad
    public void agregarProducto(String nombre, double precio, int cantidad) {
        if (precio < 0 || cantidad < 0) {
            System.out.println("Error: precio o cantidad no pueden ser negativos.");
            return;
        }
        productos.add(new Producto(nombre, precio, cantidad));
        System.out.println("Producto agregado: " + nombre + " | Precio: " + precio + " | Cantidad: " + cantidad);
    }

    // Mostrar todos los productos
    public void mostrarInventario() {
        System.out.println("\n--- Inventario ---");
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }
}

// Clase principal para probar
public class MainInventario {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        inv.agregarProducto("Lapicero");
        inv.agregarProducto("Cuaderno", 2.5);
        inv.agregarProducto("Mochila", 35.0, 10);
        inv.agregarProducto("Regla", -3.0);          // Precio negativo (error)
        inv.agregarProducto("Borrador", 1.0, -5);    // Cantidad negativa (error)

        inv.mostrarInventario();
    }
}

