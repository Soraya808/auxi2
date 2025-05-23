
package habitacion;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;


class Casa {
    private String direccion;
    private List<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void mostrarCasa() {
        System.out.println("Dirección de la casa: " + direccion);
        System.out.println("Habitaciones:");
        for (Habitacion h : habitaciones) {
            h.mostrarInfo();
        }
    }
}
