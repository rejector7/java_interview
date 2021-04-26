package basics.Ch10;

import java.util.ArrayList;
import java.util.List;
import static util.Print.*;

public class Problem24 {
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
    private List<Event> eventList = new ArrayList<>();
    public void addEvent(Event e){
        eventList.add(e);
    }
    public void run(){
        while(eventList.size() > 0){
            for(Event e: eventList){
                println(e);
                e.start();
                eventList.remove(e);
            }
        }
    }
}

class GreenhouseController extends Controller{
    private boolean light = false;
    private boolean water = false;

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
}