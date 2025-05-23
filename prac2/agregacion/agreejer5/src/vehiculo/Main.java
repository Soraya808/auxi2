
package vehiculo;
public class Main {
    public static void main(String[] args) {
        Flota flota = new Flota();

        // Vehículos
        flota.agregarVehiculo(new Vehiculo("Toyota", "Corolla", 2020));
        flota.agregarVehiculo(new Vehiculo("Ford", "F-150", 2022));
        flota.agregarVehiculo(new Vehiculo("Chevrolet", "Spark", 2019));

        // Conductores
        flota.agregarConductor(new Conductor("Pedro Gómez", "LIC12345"));
        flota.agregarConductor(new Conductor("Ana Torres", "LIC67890"));

        // Mostrar información
        flota.mostrarFlota();
    }
}
