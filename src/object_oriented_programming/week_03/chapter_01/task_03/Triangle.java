package object_oriented_programming.week_03.chapter_01.task_03;

public class Triangle extends Shape {
    private double width, height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.height * this.width / 2;
    }
}
