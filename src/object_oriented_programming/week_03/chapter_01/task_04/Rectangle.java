package object_oriented_programming.week_03.chapter_01.task_04;

public class Rectangle extends Shape {
    private double width, height;
    private ShapeTypes type = ShapeTypes.RECTANGLE;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }

    @Override
    public ShapeTypes getType() {
        return this.type;
    }

    @Override
    public boolean isCompatible(Shape shape) {
        return shape.getType() == this.type;
    }
}
