package util;
import java.io.*;

public class Print {
    public static void println(){
        System.out.println();
    }

    public static void println(Object o){
        System.out.println(o);
    }

    public static void print(Object o){
        System.out.print(o);
    }

    public static PrintStream printf(String format, Object... args){
        return System.out.printf(format, args);
    }
}
