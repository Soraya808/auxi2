package templeado;
public class TComisionista extends TEmpleado {
    private double base;
    private double comision;
    private double ventas;

    public TComisionista(String nombre, double base, double comision, double ventas) {
        super(nombre);
        this.base = base;
        this.comision = comision;
        this.ventas = ventas;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getSalario() {
        return base + comision * ventas;
    }
}
