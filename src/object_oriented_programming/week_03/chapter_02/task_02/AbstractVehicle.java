package object_oriented_programming.week_03.chapter_02.task_02;

import object_oriented_programming.week_03.chapter_02.task_01.Vehicle;

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

    public VehicleTypes getType() {
        return type;
    }

    public String getFuel() {
        return fuel;
    }
}
