package simulation.exercise_01.task_04;

import java.util.LinkedList;
import java.util.Scanner;

public class Run_simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char answer;
        LinkedList<Customer> list = new LinkedList<>();

        do {
            System.out.println("Options:");
            System.out.println("1. Add customer");
            System.out.println("2. Remove customer");
            System.out.println("3. Exit application\n");

            System.out.print("Your choice: ");
            answer = scanner.next().charAt(0);

            if (answer == '1') {
                Customer testCustomer = new Customer();
                list.add(testCustomer);
            } else if(answer == '2') {
                Customer testCustomer = list.peek();
                testCustomer.setEndTime(System.nanoTime());

                System.out.printf("Removed user %d, Time spend was: %d ms\n", testCustomer.getId(), (int)(testCustomer.getDeltaTime() / 1000 / 1000));
                list.remove();
            }
        } while(answer != '3');
    }
}
