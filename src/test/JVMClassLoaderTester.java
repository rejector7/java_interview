package test;


import org.junit.Test;

class Tester01{
    static int c = 1;
}

public class JVMClassLoaderTester {
    private int a;
    private final int b = 0;

    @Test
    public void test01(){
        System.out.println(Tester01.c);

        try {
            int a = 1;
        }catch (Exception e){
            e.getMessage();
        }
    }



}
