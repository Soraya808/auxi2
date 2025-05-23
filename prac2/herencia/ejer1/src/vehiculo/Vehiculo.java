
package vehiculo;
public class Vehiculo {
protected String marca;
protected String modelo;
protected int año;
protected int precio;
public Vehiculo(String mar,String mo,int año,int precio){
    this.marca=mar;
    this.modelo=mo;
    this.año=año;
    this.precio=precio; 
} 
public void mostrar_info(){
    System.out.println("el vehiculo es de marca: "+marca+" de modelo: "+modelo+" del año: "
    +año+" y el precio es de: "+precio);
}
}
