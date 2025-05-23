
package jugador;
public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Tigres FC");

        equipo.agregarJugador(new Portero("Carlos López", 1, "Atajadas"));
        equipo.agregarJugador(new Defensa("Luis Pérez", 4, "Marcaje"));
        equipo.agregarJugador(new Mediocampista("Mario Ruiz", 8, "Pases"));
        equipo.agregarJugador(new Delantero("Andrés Gómez", 9, "Goles"));

        equipo.mostrarEquipo();
    }
}
