package object_oriented_programming.week_03.chapter_02.task_01;

public class Motorcycle implements Vehicle {
    private VehicleTypes type = VehicleTypes.MOTORCYCLE;
    private String fuel = "Gasoline";
    private String color = "Black";

    public Motorcycle(String color) {
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Bus info:");
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + this.fuel);
        System.out.println("Color: " + this.color);
    }
}
