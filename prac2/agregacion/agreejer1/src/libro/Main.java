
package libro;
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry");
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.mostrarBiblioteca();
    }
}

