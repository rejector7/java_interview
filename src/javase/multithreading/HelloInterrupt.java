package javase.multithreading;

public class HelloInterrupt {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("t1");
        System.out.println(t1.getName() + t1.getState());
        t1.start();
        System.out.println(t1.getName() + t1.getState());
        Thread.sleep(1000);
        t1.interrupt();
        System.out.println(t1.getName() + t1.getState());
        Thread.sleep(1000);
        System.out.println(t1.getName() + t1.getState());
    }
}

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        try{
            int i = 0;
            while(!isInterrupted()){
                Thread.sleep(300);
                i++;
                System.out.println(this.getName() + this.getState() + "loop" + i);
            }
        } catch (InterruptedException e) {
            System.out.println(this.getName() + this.getState() + "Interrupted");
            e.printStackTrace();
        }
    }
}