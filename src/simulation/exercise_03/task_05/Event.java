package simulation.exercise_03.task_05;

import simulation.exercise_02.task_05.EventType;

public class Event {

    private Arrival arrival;
    private Customer customer;
    private EventTypes type;
    private int time;
    public Event(Arrival arrival) {
        this.arrival = arrival;
        this.type = EventTypes.ARRIVAL;
        this.time = arrival.getTime();
    }

    public Event(Customer customer) {
        this.customer = customer;
        this.type = EventTypes.CUSTOMER;
    }

    public EventTypes getType() {
        return this.type;
    }

    public Arrival getArrival() {
        return this.arrival;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public int getTime() {
        return this.time;
    }
}
