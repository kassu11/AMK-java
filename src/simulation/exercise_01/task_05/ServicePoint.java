package simulation.exercise_01.task_05;

import java.util.LinkedList;
import simulation.exercise_01.task_05.Customer;
public class ServicePoint {
    LinkedList<Customer> customers = new LinkedList<>();

    public void addToQueue() {
        Customer newCustomer = new Customer();
        customers.add(newCustomer);
    }

    public void removeFromQueue() {
        Customer customer = customers.peek();
        customer.setEndTime(System.nanoTime());
        System.out.printf("Removed user %d, Time spend was: %d ms\n", customer.getId(), (int)(customer.getDeltaTime() / 1000 / 1000));
        customers.remove();
    }

    public void serviceAllCustomer() {
        while(customers.size() > 0) {
            int r = (int)(Math.random() * 1000);
            try {
                Thread.sleep(r);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
            
            removeFromQueue();
        }
    }
}
