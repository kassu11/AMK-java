package simulation.exercise_03.task_04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Arrival> eventList = new ArrayList<>();

        Clock clock = Clock.getInstance(0);
        for(int i = 0; i < 10; i++) {
            Arrival event = new Arrival(clock);
            clock.setTime(event.getTime());
            eventList.add(event);
        }

        for(Arrival event : eventList) {
            System.out.printf("Event time: %s\n", event);
        }
    }
}
