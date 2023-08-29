package object_oriented_programming.exercise_01.chapter_02;

import java.util.Scanner;

public class Task_02 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Width (cm): ");
		double width = reader.nextDouble();

		System.out.print("Height (cm): ");
		double height = reader.nextDouble();

		double hypotenuse = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

		System.out.println(hypotenuse);
	}
}
