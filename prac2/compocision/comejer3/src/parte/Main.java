package parte;
public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 737", "Boeing");

        Parte motor = new Parte("Motor", 1500.0);
        Parte ala = new Parte("Ala", 800.0);
        Parte trenAterrizaje = new Parte("Tren de aterrizaje", 500.0);

        avion.agregarParte(motor);
        avion.agregarParte(ala);
        avion.agregarParte(trenAterrizaje);

        avion.mostrarAvion();
    }
}

