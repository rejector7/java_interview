// Pro 2 and 4
package basics.Ch10;
import static util.Print.*;

public class Problem4 {
    public static void main(String[] args){
        Sequence s = new Sequence();
        Sequence.SequenceSelector ss = (Sequence.SequenceSelector) s.selector();
        ss.getSequence().run();
    }
}

interface Selector{

}

class Sequence{
    public Sequence(){
        println("Sequence Cons.");
    }
    public void run(){
        println("Sequence run.");
    }
    class SequenceSelector implements Selector{
        public SequenceSelector(){
            println("Sequence Selector Cons.");
        }
        public Sequence getSequence(){
            return Sequence.this;
        }
    }
    public Selector selector(){
        return new SequenceSelector();
    }

}