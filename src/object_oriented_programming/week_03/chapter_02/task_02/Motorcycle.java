package object_oriented_programming.week_03.chapter_02.task_02;

public class Motorcycle extends AbstractVehicle {
    private String color = "Black";

    public Motorcycle(String color) {
        super(VehicleTypes.MOTORCYCLE, "Gasoline");
        this.color = color;
    }

    @Override
    public void getInfo() {
        System.out.println("Bus info:");
        System.out.println("Type: " + this.getType());
        System.out.println("Fuel: " + this.getFuel());
        System.out.println("Color: " + this.color);
    }
}
