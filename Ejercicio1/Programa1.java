package Ejercicio1;

public class Programa1 {
    public static void main(String[] args) {
        Thread hilo1 = new Thread(new Hilo1(1, 100, "Hilo 1:"));
        Thread hilo2 = new Thread(new Hilo1(100, 1, "Holo 2:"));
        hilo1.start();
        hilo2.start();
    }
}
