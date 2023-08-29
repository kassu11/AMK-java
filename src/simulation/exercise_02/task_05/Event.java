package simulation.exercise_02.task_05;

public class Event implements Comparable<Event> {
    private static int nextId = 1;
    final private int id;
    final private int eventStart;
    long startTime, endTime;

    EventType type;

    public Event(int start) {
        this.id = nextId++;
        this.startTime = System.nanoTime();
        this.eventStart = start;
        if(Math.random() < .5) {
            this.type = EventType.LEAVES;
        } else {
            this.type = EventType.ARRIVES;
        }
    }

    @Override
    public int compareTo(Event e) {
        return this.eventStart - e.eventStart;
    }

    public EventType getType() {
        return this.type;
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