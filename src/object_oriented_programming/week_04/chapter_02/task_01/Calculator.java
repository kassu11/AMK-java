package object_oriented_programming.week_04.chapter_02.task_02;

public class Calculator {
    //  write a temporary main method that creates an instance of the Calculator class and uses it to calculate the sum of a few integers.
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2, 3, 4, 5));
        System.out.println(calculator.subtract(1, 2, 3, 4, 5));
        System.out.println(calculator.multiply(1, 2, 3, 4, 5));
        System.out.println(calculator.divide(1, 2, 3, 4, 5));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int subtract(int... numbers) {
        int difference = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            difference -= numbers[i];
        }

        return difference;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int... numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }

        return product;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int divide(int... numbers) {
        int quotient = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            quotient /= numbers[i];
        }

        return quotient;
    }
}
