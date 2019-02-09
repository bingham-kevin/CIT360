package Concurrency;

import java.util.concurrent.Callable;

public class MathThread {

    Runnable runThread = new Runnable(){
        @Override
        public void run(){
                int number = 42 * 345322 - 44 * 2;
            System.out.println("\nMath1 " + number);
        }
    };

    Callable call1 = new Callable<Integer>() {
        @Override
        public Integer call() throws Exception {
            int number = 876 * 5222 - 4 * 234534;
            return number;
        }
    };

    Callable call2 = new Callable<Integer>() {
        @Override
        public Integer call() throws Exception {
            int number = 447 * 5222 - 4 * 234534;
            return number;
        }
    };

    Callable call3 = new Callable<Integer>() {
        @Override
        public Integer call() throws Exception {
            int number = 124 * 5222 - 4 * 234534;
            return number;
        }
    };

    Callable call4 = new Callable<Integer>() {
        @Override
        public Integer call() throws Exception {
            int number = 98778 * 5222 - 4 * 234534;
            return number;
        }
    };

    Callable call5 = new Callable<Integer>() {
        @Override
        public Integer call() throws Exception {
            int number = 7654 * 5222 - 4 * 234534;
            return number;
        }
    };
}
