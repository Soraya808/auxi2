
package producto;
import java.util.ArrayList;

public class CarritoCompras {
    private ArrayList<Producto> productos;
    private final int LIMITE = 10;

    public CarritoCompras() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (productos.size() < LIMITE) {
            productos.add(producto);
            System.out.println("Producto agregado: " + producto.getNombre());
        } else {
            System.out.println("¡No se pueden agregar más de 10 productos al carrito!");
        }
    }

    public void mostrarCarrito() {
        System.out.println("Carrito de Compras:");
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }
}
