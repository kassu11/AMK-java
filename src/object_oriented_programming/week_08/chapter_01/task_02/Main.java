package object_oriented_programming.week_08.chapter_01.task_02;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 6, 24, 18, 3, 9, 5);
        int total = numbers.stream().filter(num -> num % 2 != 0).map(num -> num * 2).reduce(0, Integer::sum);
        System.out.println(total);
    }
}
