
package vehiculo;
public class Moto extends Vehiculo {
    protected int cilindrada;
    protected String tipo_motor;
    public Moto(int cilindrada, String tipo, String mar, String mo, int año, int precio) {
        super(mar, mo, año, precio);
        this.cilindrada=cilindrada;
        this.tipo_motor=tipo;
        this.marca=mar;
        this.modelo=mo;
        this.año=año;
        this.precio=precio;
    }
    public void mostrar(){
        super.mostrar_info();
        System.out.println("la moto tiene cilindrada: "+cilindrada+" tipo de ombustible"+tipo_motor);
    }
    
}
