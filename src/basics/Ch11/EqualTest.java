package basics.Ch11;
import static util.Print.*;

public class EqualTest {
    public static void main(String[] args) {
        Character a = 1000;
        Character b = 1000;
        Character c = new Character(a);
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(a == b);
        System.out.println(a == c);
        println(s1 == s2);
    }
}
