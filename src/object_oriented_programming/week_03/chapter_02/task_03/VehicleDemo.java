package object_oriented_programming.week_03.chapter_02.task_03;

public class VehicleDemo {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("red", 50);
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle("green", 60);

        electricCar.charge();
        electricMotorcycle.charge();

    }
}
