package basics.Ch11;
import java.util.LinkedList;
import java.util.Queue;

import static util.Print.*;

public class Porblem27 {
    static class Command{
        private final String s = "command";
        public void operation(){
            println(s);
        }
    }
    static class Producer{
        public Queue<Command> produce(Queue<Command> q){
            q.offer(new Command());
            return q;
        }
    }

    static class Consumer{
        public void consume(Queue<Command> q){
            Command c = q.poll();
            assert c != null;
            c.operation();
        }
    }

    public static void main(String[] args) {
        Queue<Command> q = new LinkedList<>();
        Producer p = new Producer();
        Consumer c = new Consumer();
        for(int i = 0; i < 5; i++){
            p.produce(q);
        }
        while(!q.isEmpty()){
            c.consume(q);
        }
    }
}
