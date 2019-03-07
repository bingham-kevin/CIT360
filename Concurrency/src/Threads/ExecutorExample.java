package Threads;

import java.util.concurrent.*;

public class ExecutorExample {
private int threadNum = 10;
    ExecutorService exeServ = Executors.newFixedThreadPool(threadNum);

    {
        System.out.println("\n\n\tRUNNING EXECUTORS\n");

        for (int i = 0; i<threadNum; i++) {
            exeServ.execute(new RunnableExample("Executor - "+i));
        }

        exeServ.shutdown();
    }
}
