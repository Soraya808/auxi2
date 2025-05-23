
package persona;
public class GestorPersonas {

    public static void mostrarEstudiantesMayores25(Estudiante[] estudiantes) {
        for (Estudiante e : estudiantes) {
            if (e.getEdad() > 25) {
                e.mostrar();
                System.out.println("-----------------------");
            }
        }
    }

    public static void mostrarDocenteIngenieroMayor(Docente[] docentes) {
        Docente mayor = null;
        for (Docente d : docentes) {
            if (d.getProfesion().equalsIgnoreCase("Ingeniero")) {
                if (mayor == null || d.getEdad() > mayor.getEdad()) {
                    mayor = d;
                }
            }
        }
        if (mayor != null) {
            System.out.println("Docente Ingeniero más viejo:");
            mayor.mostrar();
        } else {
            System.out.println("No se encontró docente ingeniero.");
        }
    }

    public static void mostrarCoincidenciasApellido(Persona[] estudiantes, Persona[] docentes) {
        for (Persona est : estudiantes) {
            for (Persona doc : docentes) {
                if (est.getApellido().equalsIgnoreCase(doc.getApellido())) {
                    System.out.println("Coincidencia de apellido: " + est.getApellido());
                    System.out.println("Estudiante:");
                    est.mostrar();
                    System.out.println("Docente:");
                    doc.mostrar();
                    System.out.println("------------------------");
                }
            }
        }
    }
}

