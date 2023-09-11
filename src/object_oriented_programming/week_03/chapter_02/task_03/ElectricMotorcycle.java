package object_oriented_programming.week_03.chapter_02.task_03;

public class ElectricMotorcycle extends Motorcycle implements ElectricVehicle {
    private double chargeAmount = 0.0;
    private double maxCharge = 120.0;

    public ElectricMotorcycle(String color, double maxCharge) {
        super(color);
        this.maxCharge = maxCharge;
    }

    @Override
    public void charge() {
        System.out.println(this.getType() + " is charging");
    }
}
