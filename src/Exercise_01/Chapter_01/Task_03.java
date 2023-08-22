package Exercise_01.Chapter_01;
import java.util.Scanner;

public class Task_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());

        float sum = first + second + third;

        System.out.println("The sum of the numbers is " + (first + second + third));
        System.out.println("The average of the numbers is " + sum / 3);
        System.out.println("The product of the numbers is " + (first * second * third));
    }
}