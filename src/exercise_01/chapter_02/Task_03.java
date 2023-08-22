package exercise_01.chapter_02;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Weight (g): ");
        double grams = reader.nextDouble();

        int leiviskä = (int)(grams / 13.28 / 32 / 20);
        int naula = (int)(grams / 13.28 / 32 % 20);
        double luoti = (grams / 13.28) % 32;

        System.out.printf("%,.0f grams is %d leiviskä, %d naula, and %.2f luoti.", grams, leiviskä, naula, luoti);
    }
}
