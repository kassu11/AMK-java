package object_oriented_programming.week_01.chapter_04;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int duplicateCount = 0;

        int[] array = new int[size];
        int[] userArray = new int[size];

        System.out.println("Enter the integers into the array:");

        for(int i = 0; i < size; i++) {
            System.out.printf("Enter integer %d: ", i + 1);
            int amount = scanner.nextInt();
            userArray[i] = amount;
        }

        main: for(int i = 0; i < size; i++) {
            int amount = userArray[i];
            for(int j = 0; j < i - duplicateCount; j++) {
                if(array[j] == amount) {
                    duplicateCount++;
                    continue main;
                }
            }
            
            array[i - duplicateCount] = amount;
        }

        for(int i = 0; i < size - duplicateCount; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
