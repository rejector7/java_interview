package test;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class Tester {
    @Test
    public void SplitTest(){
        String s = "12,;,123,;,";
        String[] split = s.split(",;,", -1);
        for(String a: split){
            System.out.println(a);
        }
        System.out.println(split.length);
    }
}
