package object_oriented_programming.week_03.chapter_02.task_04;

public class VehicleDemo {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("red", 50);
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle("green", 60);
        Bus bus = new Bus(50);
        Car car = new Car("Green");
        Motorcycle motorcycle = new Motorcycle("red");

        electricCar.calculateFuelEfficiency();
        electricMotorcycle.calculateFuelEfficiency();
        bus.calculateFuelEfficiency();
        car.calculateFuelEfficiency();
        motorcycle.calculateFuelEfficiency();
    }
}
