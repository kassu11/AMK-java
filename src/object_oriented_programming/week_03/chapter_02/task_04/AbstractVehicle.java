package object_oriented_programming.week_03.chapter_02.task_04;

abstract class AbstractVehicle implements Vehicle {
    private VehicleTypes type;
    private String fuel;

    public AbstractVehicle(VehicleTypes type, String fuel) {
        this.type = type;
        this.fuel = fuel;
    }

    public void start() {
        System.out.println(this.type + " is starting...");
    }

    public void stop() {
        System.out.println(this.type + " is stopping...");
    }

    public void calculateFuelEfficiency() {
        switch(this.getFuel()) {
            case "Electricity" -> {
                System.out.println("Fuel efficiency is infinite?");
            }
            case "Petrol" -> {
                System.out.println("Fuel efficiency is 10.0");
            }
            case "Diesel" -> {
                System.out.println("Fuel efficiency is 15.0");
            }
            case "Gasoline" -> {
                System.out.println("Fuel efficiency is 20.0");
            }
            default -> {
                System.out.println("Fuel efficiency is unknown");
            }
        }
    }

    public VehicleTypes getType() {
        return type;
    }

    public String getFuel() {
        return fuel;
    }
}
