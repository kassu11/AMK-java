package object_oriented_programming.week_05.chapter_01.task_02;

public class Main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Calculate calculate2 = new Calculate();
        Calculate calculate3 = new Calculate();

        calculate.run();
        calculate2.run();
        calculate3.run();

        while (calculate.getProcessesRunning() > 0) {
            try {
                Thread.sleep(200L);
            }
            catch (InterruptedException e) {
                System.out.println("Main: Interrupted!");
                return;
            }
        }

        System.out.println("Sum: " + calculate.getSum());
    }
}
