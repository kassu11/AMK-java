package simulation.exercise_02.task_04;


import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Event> que = new PriorityQueue<>();

        Scanner scanner = new Scanner(System.in);
        char answer;

        do {
            System.out.println("Options:");
            System.out.println("1. Add event");
            System.out.println("2. Remove event");
            System.out.println("3. Exit application\n");

            System.out.print("Your choice: ");
            answer = scanner.next().charAt(0);

            if (answer == '1') {
                System.out.print("Enter event start time: ");
                int eventStart = scanner.nextInt();

                que.add(new Event(eventStart));
            } else if(answer == '2') {
                Event event = que.poll();
                System.out.printf("Removed event %d\n", event.getEventStart());
            }
        } while(answer != '3');


        while(que.size() > 0) {
            System.out.printf("Event: %d\n", que.poll().getEventStart());
        }
    }
}
