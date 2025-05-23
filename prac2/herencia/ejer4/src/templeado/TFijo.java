package templeado;
public class TFijo extends TEmpleado {
    private double sueldo;

    public TFijo(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public double getSalario() {
        return sueldo;
    }
}

