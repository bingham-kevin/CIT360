package Threads;

import java.util.concurrent.atomic.AtomicInteger;

public class RunnableExample implements Runnable {
    private int threadCount = 5;
    private String threadName;
    private AtomicInteger c = new AtomicInteger(threadCount);

    RunnableExample(String name){
        threadName = name;
        System.out.println(
            "----------------------------"+
            "\n\tStarting " +
            threadName +
            "\n----------------------------"
        );
    }

    @Override
    public void run() {
        System.out.println(
            "****************************"+
            "\n\t\tRunning " +
            threadName +
            "\n****************************"
        );
        try {
            for (int i = threadCount; i > 0; i--) {
                System.out.println("Counting Down " + c.getAndDecrement());
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}