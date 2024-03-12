package Ejercicio2;
public class Programa2{

    public static void main(String[] args) {
        Thread hilo1 = new Thread(new Hilo2(" Hola "));
        Thread hilo2 = new Thread(new Hilo2(" Mundo"));
        hilo1.start();
        hilo2.start();
    }
}



