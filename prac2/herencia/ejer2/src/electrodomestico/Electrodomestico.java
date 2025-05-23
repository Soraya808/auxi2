
package electrodomestico;
public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico; // A-F
    protected double peso;

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = Character.toUpperCase(consumoEnergetico);
        this.peso = peso;
    }

    public double precioFinal() {
        double precioFinal = precioBase;

        // Consumo energético
        switch (consumoEnergetico) {
            case 'A' -> precioFinal += 100;
            case 'B' -> precioFinal += 80;
            case 'C' -> precioFinal += 60;
            case 'D' -> precioFinal += 50;
            case 'E' -> precioFinal += 30;
            case 'F' -> precioFinal += 10;
        }

        // Peso
        if (peso < 20) {
            precioFinal += 10;
        } else if (peso < 50) {
            precioFinal += 50;
        } else if (peso < 80) {
            precioFinal += 80;
        } else {
            precioFinal += 100;
        }

        return precioFinal;
    }
}

