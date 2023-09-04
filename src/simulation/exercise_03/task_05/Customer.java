package simulation.exercise_03.task_05;

public class Customer {
    private int startingTime;

    public Customer(int time) {
        this.startingTime = time;
    }

    public void moveToQueue(ServicePoint point) {
        point.addToQueue(this);
    }

    public int getDeltaTime(Clock clock) {
        return clock.getTime() - this.startingTime;
    }
}
