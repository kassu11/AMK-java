package object_oriented_programming.week_03.chapter_01.task_01;

public class Car {
    private String typeName;
    private double speed = 0;
    private double topSpeed = 120.0f;
    private double gasolineLevel = 0.0;
    private double tank = 100;

    private double cruseControlSpeed = 0;
    private boolean cruseControlOn = false;

    public Car(String typeName) {
        this.typeName = typeName;
    }

    public void accelerate() {
        if (this.gasolineLevel > 0) {
            this.gasolineLevel -= 2;
            this.speed += 10;
            if(this.speed >= this.topSpeed) this.speed = this.topSpeed;
        }
        else this.speed = 0;
    }
    void decelerate(int amount) {
        if (this.gasolineLevel > 0) {
            this.gasolineLevel -= amount / 5.0;
            if (amount > 10) amount = 10;
            if (amount > 0)
                this.speed = Math.max(0, this.speed - amount);
        } else this.speed = 0;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
        if (this.speed < 0) this.speed = 0;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public void fillTank() {
        this.gasolineLevel = this.tank;
    }

    public void setGasolineLevel(double gasolineLevel) {
        this.gasolineLevel = gasolineLevel;

        if (this.gasolineLevel < 0) this.gasolineLevel = 0;
        if (this.gasolineLevel > this.tank) this.fillTank();
    }

    public void setTankLimit(int num) {
        this.tank = num;
    }

    public void setCruiseControlSpeed(double num) {
        this.cruseControlSpeed = num;
    }

    public void setTopSpeed(int num) {
        this.topSpeed = num;
    }
    
    public double getGasolineLevel() {
        return this.gasolineLevel;
    }

    public void turnOnOfCruiseControl() {
        this.cruseControlOn = !this.cruseControlOn;
        if (this.cruseControlSpeed > this.topSpeed || this.cruseControlSpeed < 0) {
            return;
        }

        while(this.cruseControlOn && this.speed != this.cruseControlSpeed) {
            if (this.speed < this.cruseControlSpeed) {
                this.accelerate();
            } else {
                this.decelerate(Math.min(10, (int)(this.speed - this.cruseControlSpeed)));
            }

            System.out.println(this.getTypeName() + ": speed is " + this.getSpeed() + " km/h");
        }
    }
}
