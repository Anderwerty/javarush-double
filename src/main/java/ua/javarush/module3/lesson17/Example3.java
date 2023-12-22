package ua.javarush.module3.lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Example3 {
    public static void main(String[] args) {

    }
}

class Notifier {

    private final List<Listener> listeners = new ArrayList<>();

    private Map<Topic, List<Listener>> map;

    public void registerListener(Listener listener, Topic topic){
        listeners.add(listener);
    }

    public void removeListener(Listener listener, Topic topic){
        listeners.remove(listener);
    }

    public void method(){

        //some logic
        listeners.forEach(l -> l.sendNotification("some notification"));
    }

}

interface Listener {
    void sendNotification(String message);
}

class Topic{

}
