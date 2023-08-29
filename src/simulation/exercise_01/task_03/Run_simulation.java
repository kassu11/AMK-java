package simulation.exercise_01.task_03;

public class Run_simulation {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Customer test = new Customer((long)(Math.random() * 100));
            test.setEndTime(test.getStartTime() + (long)(Math.random() * 100));
            System.out.printf("Customer %d: delta time: %d\n", test.getId(), test.getDeltaTime());
        }
    }
}
