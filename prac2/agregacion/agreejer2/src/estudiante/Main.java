
package estudiante;
public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Carlos", "Ingeniería", 5);
        Estudiante e2 = new Estudiante("Ana", "Medicina", 3);
        Estudiante e3 = new Estudiante("Luis", "Derecho", 1);

        Universidad uni = new Universidad("Universidad Nacional");

        uni.agregarEstudiante(e1);
        uni.agregarEstudiante(e2);
        uni.agregarEstudiante(e3);

        uni.mostrarUniversidad();
    }
}
