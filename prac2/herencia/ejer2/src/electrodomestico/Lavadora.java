
package electrodomestico;
public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
   public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    @Override
    public double precioFinal() {
        double precio = super.precioFinal();

        if (carga > 30) {
            precio += 50;
        }

        return precio;
    }
}
