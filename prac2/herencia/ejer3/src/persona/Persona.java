
package persona;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
    protected String ci;
    protected String nombre;
    protected String apellido;
    protected String celular;
    protected LocalDate fechaNac;

    public Persona(String ci, String nombre, String apellido, String celular, LocalDate fechaNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
    }

    public int getEdad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }

    public String getApellido() {
        return apellido;
    }

    public void mostrar() {
        System.out.println(nombre + " " + apellido + " | CI: " + ci + " | Cel: " + celular + " | Fecha Nac: " + fechaNac);
    }
}
