package Concurrency;

import java.util.concurrent.Callable;


public class RunnableExample{

    Runnable runThread = new Runnable(){
        @Override
        public void run(){
            System.out.println("Single Thread Executed!");
        }
    };

    Callable first = new Callable<String>() {
        @Override
        public String call() throws Exception {
            return "First Callable";
        }
    };

    Callable second = new Callable<String>() {
        @Override
        public String call() throws Exception {
            return "Second Callable";
        }
    };

    Callable third = new Callable<String>() {
        @Override
        public String call() throws Exception {
            return "Third Callable";
        }
    };

    Callable fourth = new Callable<String>() {
        @Override
        public String call() throws Exception {
            return "Fourth Callable";
        }
    };


}
