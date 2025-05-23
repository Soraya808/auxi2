
package empleado;
import java.util.ArrayList;

public class EquipoTrabajo {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public EquipoTrabajo(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEquipo() {
        System.out.println("Equipo de Trabajo: " + nombre);
        System.out.println("Empleados:");
        for (Empleado empleado : empleados) {
            empleado.mostrarInfo();
        }
    }
}
