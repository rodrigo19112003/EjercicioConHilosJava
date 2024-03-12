package Ejercicio1;

public class Hilo1 implements Runnable {
    private int numberSource;
    private int numberDestination;
    private String name;

    public Hilo1(int numberSource, int numberDestination, String name){
        this.numberSource = numberSource;
        this.numberDestination = numberDestination;
        this.name = name;
    }

    @Override
    public void run(){
        if(numberSource < numberDestination){
            for(int i = numberSource; i <= numberDestination; i++){
                System.out.println(name + " "+ i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }else{
            for(int i = numberSource; i >= numberDestination; i--){
                System.out.println(name + " "+ i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
