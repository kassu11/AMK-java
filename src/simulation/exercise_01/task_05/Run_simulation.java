package simulation.exercise_01.task_05;

import java.util.LinkedList;
import java.util.Scanner;

public class Run_simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char answer;
        LinkedList<Customer> list = new LinkedList<>();
        ServicePoint servicePoint = new ServicePoint();

        System.out.print("How many customers do you want to add: ");
        int amount = scanner.nextInt();

        for(int i = 0; i < amount; i++) {
            servicePoint.addToQueue();
        }

        servicePoint.serviceAllCustomer();
    }
}
