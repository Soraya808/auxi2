package electrodomestico;
public class Television extends Electrodomestico {
    private int resolucion; // en pulgadas
    private boolean sintonizadorTDT;

    public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();

        if (resolucion > 40) {
            precio *= 1.30; // incrementa 30%
        }

        if (sintonizadorTDT) {
            precio += 50;
        }

        return precio;
    }
}

