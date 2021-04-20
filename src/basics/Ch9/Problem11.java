package basics.Ch9;
import static util.Print.*;


interface Processor{
    Object process(Object o);
}

class Apply{
    public static void process(Processor p, Object o){
        println(p.process(o));
    }
}

class SwapString{
    public String process(String s){
        return s;
    }
}

class SwapAdapter implements Processor{
    private SwapString swapstring;
    public SwapAdapter(SwapString ss){
        this.swapstring = ss;
    }

    public String process(Object s){
        return swapstring.process((String) s);
    }
}
public class Problem11 {
    public static void main(String[] args){
        SwapString ss = new SwapString();
        SwapAdapter sa = new SwapAdapter(ss);
        Apply.process(sa, "Test");
    }
}
