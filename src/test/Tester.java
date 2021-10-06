package test;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
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

    public void EqualTest(){
        HashSet<Integer> set = new HashSet<>();
        set.hashCode();
    }

    @Test
    public void MatchTest(){
        String a = "0123456";
        System.out.println(a.replace("[0456789]", "3"));
        System.out.println(a);
    }


}
