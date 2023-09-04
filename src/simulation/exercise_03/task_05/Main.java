package simulation.exercise_03.task_05;

public class Main {
    public static void main(String[] args) {
        EventList eventList = new EventList();
        ServicePoint servicePoint = new ServicePoint();

        Clock clock = Clock.getInstance(0);
        for(int i = 0; i < 10; i++) {
            Arrival event = new Arrival(clock);
            clock.setTime(event.getTime());
            event.addToList(eventList);
        }

        for(int i = 0; i < eventList.getEvents().size(); i++) {
            Event event = eventList.getEvents().get(i);
            if(event.getType() == EventTypes.ARRIVAL) {
                Customer customer = new Customer(event.getTime());
                customer.moveToQueue(servicePoint);
                System.out.printf("Event time: %s\n", event.getTime());
                eventList.removeEvent(event);
                i--;
            }
        }

        clock.addTime(5);


        while(!servicePoint.getCustomerQueue().isEmpty()) {
            Customer customer = servicePoint.getCustomerQueue().get(0);
            System.out.printf("Customer time: %s\n", customer.getDeltaTime(clock));
            servicePoint.getCustomerQueue().remove(0);
        }

        System.out.printf("Current time: %d", clock.getTime());
    }
}
