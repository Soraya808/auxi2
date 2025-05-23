package pagina;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String autor;
    private List<Pagina> paginas;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = new ArrayList<>();
    }

    public void agregarPagina(Pagina pagina) {
        if (paginas.size() < 500) {
            paginas.add(pagina);
        } else {
            System.out.println("No se puede agregar más páginas. El libro ya tiene 500 páginas.");
        }
    }

    public void mostrarLibro() {
        System.out.println("Libro: " + titulo + " - Autor: " + autor);
        System.out.println("Páginas:");
        for (Pagina p : paginas) {
            p.mostrarInfo();
        }
    }
}
