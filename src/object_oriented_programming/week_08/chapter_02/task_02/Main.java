package object_oriented_programming.week_08.chapter_02.task_02;

import java.util.List;

@FunctionalInterface
interface IntMath {
    int add(int value);
}

@FunctionalInterface
interface DoubleFiltering {
    boolean filter(int value);
}

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 6, 24, 18, 3, 9, 5, 2, 1);
        IntMath math = value -> value * 2;
        DoubleFiltering odd = value -> value % 2 != 0;

        int total = numbers.stream().filter(odd::filter).map(math::add).reduce(0, Integer::sum);
        System.out.println(total);
    }
}
