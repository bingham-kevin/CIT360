package Threads;

public class CountByTwo extends Thread{
    private int counter = 0;

    public void run(){
        System.out.println("Count By Two");
        for(int i = 0;i < 15;i++){
            counter = counter + 2;
            try {
                System.out.println("\tAdd 2 + " + counter);
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
