package Threads;

public class Main {
    public static void main(String[] args) {

    //Runnables
        System.out.println("\n\n\tRUNNABLES\n");
        Thread thread1 = new Thread(new RunnableExample("Thread 1"));
         thread1.start();

        Thread thread2 = new Thread(new RunnableExample("Thread 2"));
            thread2.start();


    //Executors
        new ExecutorExample();

    //Threads
        System.out.println("\n\n\tTHREADS\n");
        CountByThree t1 = new CountByThree();
            t1.start();

        CountByTwo t2 = new CountByTwo();
            t2.start();
    }
}
