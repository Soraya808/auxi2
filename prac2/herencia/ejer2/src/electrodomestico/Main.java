package electrodomestico;
public class Main {
    public static void main(String[] args) {
        Lavadora l1 = new Lavadora(200, "Blanco", 'B', 40, 35);
        Lavadora l2 = new Lavadora(250, "Gris", 'A', 60, 25);
        Television tv = new Television(500, "Negro", 'C', 30, 42, true);

        Lavadora[] lavadoras = { l1, l2 };

        System.out.println("Lavadoras con carga > 30kg:");
        for (Lavadora l : lavadoras) {
            if (l.getCarga() > 30) {
                System.out.println("Carga: " + l.getCarga() + "kg, Precio final: $" + l.precioFinal());
            }
        }
    }
}

