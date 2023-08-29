package object_oriented_programming.week_01.chapter_03;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score, i;
        final int ROUNDS = 10;

        do {
            score = 0;

            System.out.println("Welcome to the multiplication quiz!");

            for(i = 0; i < ROUNDS; i++) {
                int a = (int)Math.ceil(Math.random() * 10);
                int b = (int)Math.ceil(Math.random() * 10);

                System.out.printf("What is %d * %d = ", a, b);
                
                int answer = scanner.nextInt();

                if (answer == a * b) {
                    score++;
                } else {
                    System.out.printf("Wrong answer! The correct answer is %d\n", a * b);
                }
            }

            System.out.printf("You scored %d out of %d\n", score, ROUNDS);

            if (score == ROUNDS) {
                System.out.println("Congratulations! You are a master of multiplication!");
            }
        } while (score < ROUNDS);
    }
}
