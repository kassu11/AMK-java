package object_oriented_programming.week_03.chapter_02.task_01;

public class Car implements Vehicle {
    private VehicleTypes type =  VehicleTypes.CAR;
    private String fuel = "Petrol";
    private String color = "red";

    public Car(String color) {
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Car info:");
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + this.fuel);
        System.out.println("Color: " + this.color);
    }
}
