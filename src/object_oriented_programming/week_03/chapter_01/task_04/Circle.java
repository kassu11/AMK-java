package object_oriented_programming.week_03.chapter_01.task_04;

public class Circle extends Shape {
    private double radius;
    private ShapeTypes type = ShapeTypes.CIRCLE;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public ShapeTypes getType() {
        return this.type;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
