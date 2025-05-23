
package componente;
public class Main {
    public static void main(String[] args) {
        Computadora pc = new Computadora("Lenovo", "ThinkPad X1");

        Componente procesador = new Componente("Procesador", "Intel Core i7");
        Componente memoria = new Componente("Memoria RAM", "32GB");
        Componente disco = new Componente("Disco Duro", "1TB SSD");

        pc.agregarComponente(procesador);
        pc.agregarComponente(memoria);
        pc.agregarComponente(disco);

        pc.mostrarComputadora();
    }
}


