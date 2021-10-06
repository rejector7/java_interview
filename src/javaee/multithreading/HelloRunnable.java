package javaee.multithreading;

public class HelloRunnable implements Runnable{

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println("i love china!");
    }

    public static void main(String[] args){
        (new Thread(new HelloRunnable())).start();
    }
}
