import java.util.*;
import java.util.concurrent.*;


public class Concurrency {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Create new single thread executor
        ExecutorService exeSingle = Executors.newSingleThreadExecutor();

        //create runnable assigned to variable runThread
        Runnable runThread = new Runnable() {
            @Override
            public void run() {
                System.out.println("Single Thread Executed!");
            }
        };

        //Execute runnable
        exeSingle.execute(runThread);

        //Submit runnable
        Future futureRun = exeSingle.submit(runThread);

        //Runnables return null when completed
        if ((futureRun.get()) == null){
            System.out.println("runThread completed");
        }else{
            System.out.println("runThread failed");
        }

        //create callable assigned to variable callThread
        Callable callThread = new Callable() {
            public Object call() throws Exception{
                System.out.println("Callable");
                return "Result returned from Callable";
            }
        };

        //Submit callable
        Future futureCall = exeSingle.submit(callThread);

        //Print value returned by completed Callable
        System.out.println(futureCall.get());


        Set<Callable<String>> callSet = new HashSet<Callable<String>>();

        callSet.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "First Callable";
            }
        });
        callSet.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Second Callable";
            }
        });
        callSet.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Third Callable";
            }
        });
        callSet.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Fourth Callable";
            }
        });

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
    }

}
