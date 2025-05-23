
package templeado;
public class TEmpleado {
    protected String nombre;

    public TEmpleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return 0.0; // será sobrescrito
    }
}

