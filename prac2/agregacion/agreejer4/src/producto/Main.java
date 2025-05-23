
package producto;
public class Main {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        carrito.agregarProducto(new Producto("Laptop", 15000));
        carrito.agregarProducto(new Producto("Mouse", 300));
        carrito.agregarProducto(new Producto("Teclado", 500));
        carrito.agregarProducto(new Producto("Monitor", 2500));
        carrito.agregarProducto(new Producto("USB", 200));
        carrito.agregarProducto(new Producto("Silla", 1200));
        carrito.agregarProducto(new Producto("Escritorio", 3000));
        carrito.agregarProducto(new Producto("Audífonos", 700));
        carrito.agregarProducto(new Producto("Impresora", 4000));
        carrito.agregarProducto(new Producto("Webcam", 800));
        // Producto 11 - no debe agregarse
        carrito.agregarProducto(new Producto("Hub USB", 150));

        carrito.mostrarCarrito();
    }
}
