package object_oriented_programming.week_03.chapter_02.task_02;

public class Car extends AbstractVehicle {
    private String color = "red";

    public Car(String color) {
        super(VehicleTypes.CAR, "Petrol");
        this.color = color;
    }

    @Override
    public void getInfo() {
        System.out.println("Car info:");
        System.out.println("Type: " + this.getType());
        System.out.println("Fuel: " + this.getFuel());
        System.out.println("Color: " + this.color);
    }
}
