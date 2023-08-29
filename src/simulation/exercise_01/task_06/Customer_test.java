package simulation.exercise_01.task_06;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Customer_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char answer;
        LinkedList<Customer> list = new LinkedList<>();
        ServicePoint servicePoint = new ServicePoint();

        System.out.print("How many customers do you want to add: ");
        int amount = scanner.nextInt();
        int sum = 0;

        for(int i = 0; i < amount; i++) {
            servicePoint.addToQueue();
        }

        servicePoint.serviceAllCustomer();

        System.out.printf("Average time: %d ms\n", (int)(servicePoint.getAverageTime() / 1000 / 1000));
    }
}
