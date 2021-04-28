package basics.Ch10;

import java.util.ArrayList;
import java.util.List;
import java.lang.Iterable;
import java.util.Iterator;
import static util.Print.*;

public class Problem24 {
    public static void main(String[] args){
        long delayTime = 1000;
        GreenhouseController gc = new GreenhouseController();
        GreenhouseController.LightOn e1 = gc.new LightOn(delayTime);
        GreenhouseController.LightOff e2 = gc.new LightOff(delayTime);
        gc.addEvent(e1);
        gc.addEvent(e2);
        gc.run();
    }
}

abstract class Event{
    private long eventTime;
    private long delayTime;
    public Event(long delayTime){
        this.delayTime = delayTime;
        start();
    }
    public void start(){
        eventTime = System.nanoTime() + delayTime;
    }
    public boolean ready(){
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();
    public abstract String toString();
}

class Controller{
    private ArrayList<Event> eventList = new ArrayList<>();
    public void addEvent(Event e){
        eventList.add(e);
    }
    public void run(){

        while(eventList.size() > 0){
            Iterator<Event> it = eventList.iterator();
            while (it.hasNext()){
                Event e = it.next();
                println(e);
                e.start();
                it.remove();
            }
        }
    }
}

class GreenhouseController extends Controller{
    private boolean water = false;
    private boolean light = false;

    public class LightOn extends Event{
        public LightOn(long delayTime){
            super(delayTime);
        }
        public void action(){
            light = true;
        }
        public String toString(){
            return "Light is on.";
        }
    }

    public class LightOff extends Event{
        public LightOff(long delayTime){
            super(delayTime);
        }
        public void action(){
            light = false;
        }
        public String toString(){
            return "light is off.";
        }
    }
}