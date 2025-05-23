
package jugador;
public class Jugador {
    protected String nombre;
    protected int numero;
    protected String posicion;

    public Jugador(String nombre, int numero, String posicion) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Número: " + numero + ", Posición: " + posicion);
    }
}
