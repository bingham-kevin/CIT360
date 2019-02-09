package Concurrency;

import java.util.*;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException{

        //Create new single thread executor
        ExecutorService exeSingle = Executors.newSingleThreadExecutor();

        RunnableExample runEx = new RunnableExample();

        //execute thread
        exeSingle.execute(runEx.runThread);

        //Submit runnable
        Future futureRun = exeSingle.submit(runEx.runThread);

        //Runnables return null when completed
        if (futureRun.get() == null){
            System.out.println("runThread completed");
        }else{
            System.out.println("runThread failed");
        }

        CallableExample callEx = new CallableExample();

        Future futureCall = exeSingle.submit(callEx.callThread);

        //Print value returned by completed Callable
        System.out.println(futureCall.get());

        Set<Callable<String>> callSet = new HashSet<Callable<String>>();

        callSet.add(runEx.first);
        callSet.add(runEx.second);
        callSet.add(runEx.third);
        callSet.add(runEx.fourth);

        //create variable to store first completed callable result
        String firstCompleted = exeSingle.invokeAny(callSet);

        //Print out which callable completed first
        System.out.println("\nInvokeAny will run thread from the set and terminate" +
                "\non the completion of the first thread or error." +
                "\nfirstCompleted = " + firstCompleted);

        List<Future<String>> allCompleted = exeSingle.invokeAll(callSet);

        //Print results of each callable run
        System.out.println("\nInvokeAll will return the results of all callables" +
                "\nin a set.");
        for(Future<String> completed :  allCompleted ){
            System.out.println("completed.get = " + completed.get());
        }

        //Shutdown executor service
        exeSingle.shutdown();

        ExecutorService exeThreadPool = Executors.newFixedThreadPool(10);

        MathThread mathEx = new MathThread();

        Future futureThread = exeThreadPool.submit(mathEx.runThread);

        System.out.println("\nThread pool: " + futureThread.get());

        Set<Callable<Integer>> threadPoolSet = new HashSet<Callable<Integer>>();

        threadPoolSet.add(mathEx.call1);
        threadPoolSet.add(mathEx.call2);
        threadPoolSet.add(mathEx.call3);
        threadPoolSet.add(mathEx.call4);
        threadPoolSet.add(mathEx.call5);

        Integer firstFinished = exeThreadPool.invokeAny(threadPoolSet);

        System.out.println("\nFirst completed thread result: " + firstFinished + "\n");

        List<Future<Integer>> allFinished = exeThreadPool.invokeAll(threadPoolSet);

        for(Future<Integer> finished : allFinished){
            System.out.println("finished.get = " + finished.get());
        }

        exeThreadPool.shutdown();
    }
}
