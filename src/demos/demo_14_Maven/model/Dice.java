package demos.demo_14_Maven.model;

public class Dice {

    private int sides;

    // constructor
    public Dice(int sides) {
        this.sides = sides;
    }

    // cast the dice
    public int cast() {
        return (int) (Math.random() * sides) + 1;
    }

    // getters and setters
    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }
}
