
package habitacion;
public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Av. Principal 456");

        Habitacion sala = new Habitacion("Sala", 25.0);
        Habitacion cocina = new Habitacion("Cocina", 10.5);
        Habitacion dormitorio = new Habitacion("Dormitorio", 18.2);

        casa.agregarHabitacion(sala);
        casa.agregarHabitacion(cocina);
        casa.agregarHabitacion(dormitorio);

        casa.mostrarCasa();
    }
}


