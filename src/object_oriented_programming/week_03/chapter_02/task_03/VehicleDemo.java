package object_oriented_programming.week_03.chapter_02.task_03;

public class VehicleDemo {
    public static void main(String[] args) {
        Bus bus = new Bus(50);
        Car car = new Car("Green");
        Motorcycle motorcycle = new Motorcycle("red");
        bus.start();
        bus.stop();
        bus.getInfo();
        System.out.println();

        car.start();
        car.stop();
        car.getInfo();
        System.out.println();

        motorcycle.start();
        motorcycle.stop();
        motorcycle.getInfo();
    }
}
