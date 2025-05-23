
package empleado;
public class Empleado {
    protected String nombre;
    protected String apellido;
    protected double salarioBase;
    protected int aniosAntiguedad;

    public Empleado(String nombre, String apellido, double salarioBase, int aniosAntiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.05 * aniosAntiguedad);
    }
}
