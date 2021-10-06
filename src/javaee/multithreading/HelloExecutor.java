package javaee.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class HelloExecutor {
    public static void main(String[] args) {
        Executor e = Executors.newFixedThreadPool(5);
        e.execute(new HelloRunnable());
    }
}
