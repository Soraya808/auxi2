
package componente;
import java.util.ArrayList;
import java.util.List;

public class Computadora {
    private String marca;
    private String modelo;
    private List<Componente> componentes;

    public Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.componentes = new ArrayList<>();
    }

    public void agregarComponente(Componente componente) {
        componentes.add(componente);
    }

    public void mostrarComputadora() {
        System.out.println("Computadora: " + marca + " " + modelo);
        System.out.println("Componentes:");
        for (Componente c : componentes) {
            c.mostrarInfo();
        }
    }
}

