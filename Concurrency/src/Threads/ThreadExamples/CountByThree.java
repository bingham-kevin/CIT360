package Threads.ThreadExamples;

public class CountByThree extends Thread{
private int counter = 0;

public void run(){
    System.out.println("\nCount By Three");
    for(int i = 0;i<10;i++){
        counter = counter + 3;
        try {
            System.out.println("Add 3 + " + counter);
            Thread.sleep(200);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
}
