package object_oriented_programming.week_01.chapter_04;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the integers into the array:");

        for(int i = 0; i < size; i++) {
            System.out.printf("Enter integer %d: ", i + 1);
            int amount = scanner.nextInt();
            array[i] = amount;
        }

        int maxValue = 0;
        int[] indexes = {0, 0};

        for(int i = 0; i < size; i++) {
            int sum = 0;
            for(int j = i; j < size; j++) {
                if (i == 0 && j == 0) {
                    maxValue = array[0];
                }

                sum += array[j];

                if(sum > maxValue) {
                    maxValue = sum;
                    indexes[0] = i;
                    indexes[1] = j;
                }
            }
        }

        System.out.printf("\nMaximum sum: %d\n", maxValue);
        System.out.printf("Integers: %d-%d\n", indexes[0] + 1, indexes[1] + 1);
    }
}
