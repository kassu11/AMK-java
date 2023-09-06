package object_oriented_programming.week_03.chapter_01.task_04;

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

        System.out.println("Is compatible: " + new Rectangle(2, 2).isCompatible((new Rectangle(4, 2))));
        System.out.println("Is compatible: " + new Circle(2).isCompatible((new Circle(4))));
        System.out.println("Is compatible: " + new Triangle(2, 2).isCompatible((new Triangle(4, 2))));
    }
}
