/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona;
import java.time.LocalDate;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("123", "Ana", "Gomez", "777111", LocalDate.of(1995, 5, 10), "RU001", LocalDate.of(2020, 3, 1), 6),
            new Estudiante("456", "Luis", "Perez", "777222", LocalDate.of(2003, 7, 15), "RU002", LocalDate.of(2022, 1, 10), 2),
            new Estudiante("789", "Carla", "Gomez", "777333", LocalDate.of(1990, 2, 20), "RU003", LocalDate.of(2019, 8, 25), 8)
        };

        Docente[] docentes = {
            new Docente("999", "Carlos", "Gomez", "444111", LocalDate.of(1980, 1, 1), "NIT001", "Ingeniero", "Sistemas"),
            new Docente("888", "Lucia", "Torrez", "444222", LocalDate.of(1985, 9, 5), "NIT002", "Licenciado", "Matemáticas"),
            new Docente("777", "Mario", "Perez", "444333", LocalDate.of(1975, 4, 10), "NIT003", "Ingeniero", "Electrónica")
        };

        System.out.println("=== Estudiantes mayores de 25 años ===");
        GestorPersonas.mostrarEstudiantesMayores25(estudiantes);

        System.out.println("\n=== Docente ingeniero más viejo ===");
        GestorPersonas.mostrarDocenteIngenieroMayor(docentes);

        System.out.println("\n=== Coincidencias de apellido entre estudiantes y docentes ===");
        GestorPersonas.mostrarCoincidenciasApellido(estudiantes, docentes);
    }
}
