package object_oriented_programming.week_03.chapter_01.task_03;

import java.util.ArrayList;

public class ShapeCalculator {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(4, 8));
        shapes.add(new Circle(14));
        shapes.add(new Triangle(4, 8));

        for(Shape shape : shapes) {
            System.out.println(shape.calculateArea());
        }
    }
}
