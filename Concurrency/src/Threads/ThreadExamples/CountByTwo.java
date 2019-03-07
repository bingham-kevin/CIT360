package Threads.ThreadExamples;

public class CountByTwo extends Thread{
    private int counter = 0;

    public void run(){
        System.out.println("\n\t\t\tCount By Two");
        for(int i = 0;i < 10;i++){
            counter = counter + 2;
            try {
                System.out.println("\t\t\tAdd 2 + " + counter);
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
