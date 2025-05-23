
package empleado;
public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Laura", "Desarrolladora", 85000);
        Empleado emp2 = new Empleado("Juan", "Analista", 72000);
        Empleado emp3 = new Empleado("Marta", "Diseñadora", 69000);

        EquipoTrabajo equipo = new EquipoTrabajo("Equipo Alpha");

        equipo.agregarEmpleado(emp1);
        equipo.agregarEmpleado(emp2);
        equipo.agregarEmpleado(emp3);

        equipo.mostrarEquipo();
    }
}

