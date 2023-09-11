package object_oriented_programming.week_03.chapter_02.task_04;

public class Bus extends AbstractVehicle {
    private int capacity;

    public Bus(int capacity) {
        super(VehicleTypes.BUS, "Diesel");
        this.capacity = capacity;
    }

    @Override
    public void getInfo() {
        System.out.println("Bus info:");
        System.out.println("Type: " + this.getType());
        System.out.println("Fuel: " + this.getFuel());
        System.out.println("Capacity: " + this.capacity);
    }
}
