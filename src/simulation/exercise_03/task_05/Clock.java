package simulation.exercise_03.task_05;

public class Clock {
    private int time = 0;
    private static Clock INSTANCE = null;

    private Clock(int time) {
        this.time = time;
    }

    public static Clock getInstance(int time) {
        if (INSTANCE == null) {
            INSTANCE = new Clock(time);
        }

        return INSTANCE;
    }

    public void setTime(int num) {
        this.time = num;
    }

    public void addTime(int num) {
        this.time += num;
    }

    public int getTime() {
        return this.time;
    }
}
