/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pagina;
public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Programación en Java", "Juan Pérez");

        libro.agregarPagina(new Pagina(1, "Introducción a Java"));
        libro.agregarPagina(new Pagina(2, "Variables y tipos de datos"));
        libro.agregarPagina(new Pagina(3, "Estructuras de control"));

        libro.mostrarLibro();
    }
}
