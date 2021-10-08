package javase.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class HelloExecutor {
    public static void main(String[] args) {
        Executor e = Executors.newFixedThreadPool(5);
        e.execute(new HelloRunnable());
    }
}
