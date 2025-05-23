
package templeado;
public class Main {
    public static void main(String[] args) {
        // Crear empleados fijos
        TFijo[] fijos = {
            new TFijo("Ana", 2500),
            new TFijo("Luis", 3100),
            new TFijo("Pedro", 2950)
        };

        // Crear empleados comisionistas
        TComisionista[] comisionistas = {
            new TComisionista("Carlos", 1000, 0.10, 8000),
            new TComisionista("Lucia", 1200, 0.08, 6000),
            new TComisionista("Marta", 1100, 0.05, 4000)
        };

        // c) Determinar el empleado fijo que gana más
        TFijo mayorFijo = fijos[0];
        for (TFijo f : fijos) {
            if (f.getSalario() > mayorFijo.getSalario()) {
                mayorFijo = f;
            }
        }
        System.out.println("Empleado fijo que más gana: " + mayorFijo.getNombre() + " con sueldo: " + mayorFijo.getSalario());

        // d) Buscar el comisionista de menor sueldo
        TComisionista menorCom = comisionistas[0];
        for (TComisionista c : comisionistas) {
            if (c.getSalario() < menorCom.getSalario()) {
                menorCom = c;
            }
        }
        System.out.println("Empleado comisionista que menos gana: " + menorCom.getNombre() + " con sueldo: " + menorCom.getSalario());
    }
}
