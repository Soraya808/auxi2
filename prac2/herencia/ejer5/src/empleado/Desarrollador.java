
package empleado;
public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;
    private int horasExtras;

    public Desarrollador(String nombre, String apellido, double salarioBase, int aniosAntiguedad,
                         String lenguajeProgramacion, int horasExtras) {
        super(nombre, apellido, salarioBase, aniosAntiguedad);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        double pagoHorasExtras = horasExtras * 20; // ejemplo: $20 por hora extra
        return super.calcularSalario() + pagoHorasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }
}
