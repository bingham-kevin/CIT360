package Concurrency;

import java.util.concurrent.*;

public class CallableExample {
    Callable callThread = new Callable() {
        public Object call() throws Exception{
            System.out.println("CallableExample run in thread.");
            return "Result returned from CallableExample";
        }
    };

}
