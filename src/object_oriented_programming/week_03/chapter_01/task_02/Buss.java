package object_oriented_programming.week_03.chapter_01.task_02;

public class Buss extends Car {
    private int numberOfPassengers = 0;

    public Buss(String typeName) {
        super(typeName);
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void passengerEnter(int numberOfPassengers) {
        this.numberOfPassengers += numberOfPassengers;
    }

    public void passengerExit(int numberOfPassengers) {
        this.numberOfPassengers -= numberOfPassengers;
    }
}
