
package vehiculo;
import java.util.ArrayList;

public class Flota {
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Conductor> conductores;

    public Flota() {
        vehiculos = new ArrayList<>();
        conductores = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void agregarConductor(Conductor conductor) {
        conductores.add(conductor);
    }

    public void mostrarFlota() {
        System.out.println("=== Flota de Vehículos ===");
        System.out.println("Vehículos:");
        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
        }

        System.out.println("\nConductores:");
        for (Conductor c : conductores) {
            c.mostrarInfo();
        }
    }
}
