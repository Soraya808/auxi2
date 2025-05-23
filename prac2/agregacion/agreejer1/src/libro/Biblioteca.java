
package libro;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarBiblioteca() {
        System.out.println("Biblioteca: " + nombre);
        System.out.println("Libros:");
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }
}
