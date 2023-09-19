package object_oriented_programming.week_05.chapter_01.task_02;

public class Calculate extends Thread {
    static private int sum = 0;
    static private int processesRunning = 0;

    public void run() {
        processesRunning++;
        for(int i = 1; i <= 1000; i++) {
            sum += i;
        }
        processesRunning--;
    }

    public int getSum() {
        return sum;
    }

    public static int getProcessesRunning() {
        return processesRunning;
    }
}
