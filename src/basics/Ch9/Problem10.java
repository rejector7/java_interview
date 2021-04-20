package basics.Ch9;
import static util.Print.*;

interface Instrument{
    void adjust();
}

interface Playable{
    void play();
}

class Wind implements Instrument, Playable{
    public void adjust(){
        println("Wind adjust.");
    }

    public void play(){
        println("Wind play.");
    }
}



public class Problem10 {
    public static void tune(Playable p){
        p.play();
    }
    public static void tuneAll(Playable[] players){
        for (Playable p: players){
            p.play();
        }
    }

    public static void main(String[] args){
        Playable[] players = {
            new Wind(),
            new Wind()
        };
        tuneAll(players);
    }
}
