
package vehiculo;

public class Coche extends Vehiculo {
    private int num_puertas;
    private String tipo_combustible;
    public Coche(int num, String com,String mar, String mo, int año, int precio) {
        super(mar, mo, año, precio);
        this.num_puertas=num;
        this.tipo_combustible=com;
        this.marca=mar;
        this.modelo=mo;
        this.año=año;
        this.precio=precio;
    }
    public void mostrar(){
         super.mostrar_info();
         System.out.println("el coche tiene el numero de puertas del coche es: "+num_puertas+" tipo de combustible: "+tipo_combustible);
    }
}
