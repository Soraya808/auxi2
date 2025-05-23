
package empleado;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear instancias
        Gerente g1 = new Gerente("Laura", "Gomez", 3000, 5, "Ventas", 1200);
        Gerente g2 = new Gerente("Carlos", "Ruiz", 3200, 3, "TI", 900);

        Desarrollador d1 = new Desarrollador("Ana", "Perez", 2800, 4, "Java", 8);
        Desarrollador d2 = new Desarrollador("Luis", "Soto", 2600, 2, "Python", 12);

        // Mostrar salarios
        System.out.println("Salario de Gerente Laura: $" + g1.calcularSalario());
        System.out.println("Salario de Gerente Carlos: $" + g2.calcularSalario());

        System.out.println("Salario de Desarrollador Ana: $" + d1.calcularSalario());
        System.out.println("Salario de Desarrollador Luis: $" + d2.calcularSalario());

        // c) Mostrar gerentes con bono > 1000
        System.out.println("\nGerentes con bono > 1000:");
        if (g1.getBonoGerencial() > 1000) {
            System.out.println("- " + g1.getNombre());
        }
        if (g2.getBonoGerencial() > 1000) {
            System.out.println("- " + g2.getNombre());
        }

        // d) Mostrar desarrolladores con más de 10 horas extras
        System.out.println("\nDesarrolladores con más de 10 horas extras:");
        if (d1.getHorasExtras() > 10) {
            System.out.println("- " + d1.getNombre());
        }
        if (d2.getHorasExtras() > 10) {
            System.out.println("- " + d2.getNombre());
        }
    }
}

