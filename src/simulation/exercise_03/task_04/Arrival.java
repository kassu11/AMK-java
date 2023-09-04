package simulation.exercise_03.task_04;

import eduni.distributions.*;
public class Arrival {
    private static Normal normal = new Normal(10, 5);
    private int time;
    public Arrival(Clock clock) {
        this.time = getRandomTime() + clock.getTime();
    }

    public int getRandomTime() {
        return (int)Math.round(normal.sample());
    }

    public int getTime() {
        return this.time;
    }

    public void addToList(EventList list) {
        list.addToEventList(this);
    }

    @Override
    public String toString() {
        return Integer.toString(this.time);
    }
}
