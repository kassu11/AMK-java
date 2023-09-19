package demos.demo_13_cores;

import java.util.Scanner;

public class Timer extends Thread {
    private double seconds = 0;

    public Timer(double seconds) {
        this.seconds = seconds;
    }

    public void run() {
        while(true) {
            try {
                Thread.sleep((long)(seconds * 1000));
                System.out.println("Timer: " + seconds + " seconds");
            } catch (InterruptedException e) {
                System.out.println("Timer: Interrupted!");
                return;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Cores:" + Runtime.getRuntime().availableProcessors());

        Timer timer = new Timer(1.5);
        Timer timer2 = new Timer(1.1);
        timer.start();
        timer2.start();
        System.out.println("Thread is free!");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Bye!");
        timer.interrupt();
        timer2.interrupt();
    }
}
