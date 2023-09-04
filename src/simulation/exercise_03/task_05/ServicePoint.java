package simulation.exercise_03.task_05;

import java.util.ArrayList;

public class ServicePoint {
    ArrayList<Customer> customerQueue = new ArrayList<>();

    public ArrayList<Customer> getCustomerQueue() {
        return this.customerQueue;
    }

    public void addToQueue(Customer customer) {
        this.customerQueue.add(customer);
    }
}
