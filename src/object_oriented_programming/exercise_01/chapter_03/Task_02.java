package object_oriented_programming.exercise_01.chapter_03;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a binary number: ");
        String binary = scanner.nextLine();

        int decimal = Integer.parseInt(binary, 2);

        System.out.printf("The binary '%s' is %d in decimal", binary, decimal);
    }
}
