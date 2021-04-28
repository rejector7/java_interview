package basics.Ch11;
import java.util.ArrayList;

import static util.Print.*;

public class Problem1 {
    public static void main(String[] args){
        ArrayList<Gerbil> gl = new ArrayList<>();
        for(int i = 0; i< 5; i++){
            gl.add(new Gerbil(i));
        }
        for(Gerbil g: gl){
            g.hop();
        }
    }
}

class Gerbil{
    private int gerbilNumber;
    public Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }
    public void hop(){
        println("hop num:" + gerbilNumber);
    }
}