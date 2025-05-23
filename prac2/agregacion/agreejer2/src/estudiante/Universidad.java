
package estudiante;
import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarUniversidad() {
        System.out.println("Universidad: " + nombre);
        System.out.println("Estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarInfo();
        }
    }
}
