package object_oriented_programming.week_02.chapter_01.task_04;

public class CarDriver {

    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        for(int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while(myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        System.out.print("\n\n");

        myCar.setCruiseControlSpeed(69);
        myCar.turnOnOfCruiseControl();
    }
}