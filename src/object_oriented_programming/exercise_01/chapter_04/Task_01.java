package object_oriented_programming.exercise_01.chapter_04;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        final char[][] FIRSTNAMES = {
            { 'K', 'a', 's', 'p', 'e', 'r' }, 
            { 'J', 'e', 's', 'p', 'e', 'r' }
        };

        final char[][] LASTNAME = {
            { 'M', 'ä', 'k', 'e', 'l', 'ä' },
            { 'R', 'a', 'n', 't', 'a', 'l', 'a' }
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the number of names you want to generate: ");
        int amount = scanner.nextInt();

        for(int i = 0; i < amount; i++) {
            int firstRandom = (int)Math.floor(Math.random() * FIRSTNAMES.length);
            int lastRandom = (int)Math.floor(Math.random() * LASTNAME.length);

            System.out.printf("%s %s\n", new String(FIRSTNAMES[firstRandom]), new String(LASTNAME[lastRandom]));
        }
    }
}
