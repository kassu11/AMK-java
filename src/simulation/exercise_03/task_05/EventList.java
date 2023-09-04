package simulation.exercise_03.task_05;

import java.util.ArrayList;

public class EventList {
    ArrayList<Event> events = new ArrayList<>();
    public EventList() {

    }

    public void addToEventList(Event event) {
        this.events.add(event);
    }

    public ArrayList<Event> getEvents() {
        return this.events;
    }

    public void removeEvent(Event event) {
        this.events.remove(event);
    }
}
