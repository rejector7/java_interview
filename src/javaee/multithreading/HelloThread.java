package javaee.multithreading;

public class HelloThread extends Thread{
    @Override
    public void run(){
        System.out.println("i love china!");
    }

    public static void main(String[] args){
        new HelloThread().start();
    }
}
