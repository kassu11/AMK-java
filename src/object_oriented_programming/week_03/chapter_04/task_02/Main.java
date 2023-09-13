package object_oriented_programming.week_03.chapter_04.task_02;

import java.io.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Double> values = new ArrayList<>();
    private static String path = "C:\\Users\\kaspe\\IdeaProjects\\AMK-java\\src\\object_oriented_programming\\week_03\\chapter_04\\task_02\\values.csv";

    public static void main(String[] args) {
        fibonacci(0, 1);
        System.out.println(values);

        try (Writer writer = new FileWriter(path)) {
            writer.write("Fibonacci sequence:\n");
            for (Double value : values) {
                writer.write(value + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void fibonacci(double valueA, double valueB) {
        if (values.size() >= 100) return;
        else if(values.size() == 0) values.add(0.0);
        else if(values.size() == 1) values.add(1.0);
        double sum = valueA + valueB;
        values.add(sum);
        fibonacci(valueB, sum);
    }
}
