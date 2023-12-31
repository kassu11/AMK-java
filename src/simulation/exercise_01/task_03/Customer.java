package simulation.exercise_01.task_03;

public class Customer {
    private static int nextId = 1;
    final private int id;
    long startTime, endTime;

    public Customer(long time) {
        this.id = nextId++;
        this.startTime = time;
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