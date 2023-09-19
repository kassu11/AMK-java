package object_oriented_programming.week_05.chapter_01.task_01;

public class Main {
    public static void main(String[] args) {
        Even even = new Even(100);
        Odd odd = new Odd(100);

        even.start();
        odd.start();

        try {
            Thread.sleep(200L);
        }
        catch (InterruptedException e) {
            System.out.println("Main: Interrupted!");
            return;
        }


        System.out.println("Printing complete.");
    }
}
