package object_oriented_programming.week_03.chapter_01.task_01;

public class SportsCar extends Car {
    private double topSpeed = 220.0;
    public SportsCar(String typeName) {
        super(typeName);
    }

    void decelerate(int amount) {
        if (this.getGasolineLevel() > 0) {
            this.setGasolineLevel(this.getGasolineLevel() - amount / 2.0);
            if (amount > 25) amount = 25;
            if (amount > 0)
                this.setSpeed(this.getSpeed() - amount);
        } else this.setSpeed(0);
    }

    public void accelerate() {
        if (this.getGasolineLevel() > 0) {
            this.setGasolineLevel(this.getGasolineLevel() - 10.0);
            this.setSpeed(Math.min(this.getSpeed() + 25, this.topSpeed));
            if(this.getSpeed() >= this.topSpeed) this.setSpeed(this.topSpeed);
        }
        else this.setSpeed(0);
    }
}
