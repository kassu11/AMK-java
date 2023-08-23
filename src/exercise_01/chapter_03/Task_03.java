package exercise_01.chapter_03;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end;

        System.out.print("Type a starting number: ");
        start = scanner.nextInt();
        System.out.print("Type a ending number: ");
        end = scanner.nextInt();

        main: for(int i = start; i <= end; i++) {
            for(int j = 2; j < i; j++) {
                if(i % j == 0) continue main;
            }

            System.out.println(i);
        }
    }
}
