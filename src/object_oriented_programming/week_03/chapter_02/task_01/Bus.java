package object_oriented_programming.week_03.chapter_02.task_01;

public class Bus implements Vehicle {
    private VehicleTypes type = VehicleTypes.BUS;
    private String fuel = "Diesel";
    private int capacity;

    public Bus( int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("Bus in starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus in stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Bus info:");
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + this.fuel);
        System.out.println("Capacity: " + this.capacity);
    }
}
