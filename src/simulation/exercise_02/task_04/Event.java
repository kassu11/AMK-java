package simulation.exercise_02.task_04;

public class Event implements Comparable<Event> {
    private static int nextId = 1;
    final private int id;
    final private int eventStart;
    long startTime, endTime;

    public Event(int start) {
        this.id = nextId++;
        this.startTime = System.nanoTime();
        this.eventStart = start;
    }

    @Override
    public int compareTo(Event e) {
        return this.eventStart - e.eventStart;
    }

    public int getEventStart() {
        return this.eventStart;
    }

    public int getId() {
        return this.id;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void setEndTime(long time) {
        this.endTime = time;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getDeltaTime() {
        return this.endTime - this.startTime;
    }
}