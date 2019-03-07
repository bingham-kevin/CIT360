package Threads;

public class CountByThree extends Thread{
private int counter = 0;

public void run(){
    System.out.println("Count By Three");
    for(int i = 0;i<15;i++){
        counter = counter + 3;
        try {
            System.out.println("Add 3 + " + counter);
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
}
