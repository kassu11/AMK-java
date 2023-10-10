package object_oriented_programming.week_08.chapter_02.task_01;

import java.util.Arrays;

public class MeanCalculator {
    public static void main(String[] args) {
        double[] numbers = { 1.2, 2.4, 3.6, 4.8, 5.0 };

        double mean = Arrays.stream(numbers).average().orElse(Double.NaN);
        System.out.println(mean);
    }
}
