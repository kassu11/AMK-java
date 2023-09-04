package simulation.exercise_03.task_04;

import java.util.ArrayList;

public class EventList {
    ArrayList<Arrival> events = new ArrayList<>();
    public EventList() {

    }

    public void addToEventList(Arrival event) {
        this.events.add(event);
    }

    public ArrayList<Arrival> getEvents() {
        return this.events;
    }
}
