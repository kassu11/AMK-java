package simulation.exercise_03.task_03;

public class Main {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance(0);
        clock.setTime(10);
        System.out.println(clock.getTime());
    }
}
