package object_oriented_programming.week_03.chapter_01.task_04;

public class Shape {
    private ShapeTypes type = ShapeTypes.SHAPE;
    public double calculateArea() {
        return 0.0;
    }

    public ShapeTypes getType() {
        return this.type;
    }

    public boolean isCompatible(Shape shape) {
        return false;
    }
}
