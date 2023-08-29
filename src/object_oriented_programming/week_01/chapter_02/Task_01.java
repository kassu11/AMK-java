package object_oriented_programming.week_01.chapter_02;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = reader.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;

        System.out.printf("Fahrenheit %.1f is %.1f in Celsius", fahrenheit, celsius);
    }
}