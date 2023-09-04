package simulation.exercise_03.task_04;

public class Main {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        Clock clock = Clock.getInstance(0);
        for(int i = 0; i < 10; i++) {
            Arrival event = new Arrival(clock);
            clock.setTime(event.getTime());
            event.addToList(eventList);
        }

        for(Arrival event : eventList.getEvents()) {
            System.out.printf("Event time: %s\n", event);
        }
    }
}
