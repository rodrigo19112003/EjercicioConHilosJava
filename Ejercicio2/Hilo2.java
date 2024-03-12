package Ejercicio2;

public class Hilo2 implements Runnable {
    private String description;

    public Hilo2(String description){
        this.description = description;
    }

    @Override
    public void run(){
            while(true){
                System.out.print(description);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}


