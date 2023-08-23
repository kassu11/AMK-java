package demos;

import java.util.Scanner;

public class Demo_02_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.parseInt(scanner.nextLine());

        switch (number) {
            case 1:
                System.out.println("The number is one.");
                break;
            case 2:
                System.out.println("The number is two.");
                break;
            default:
                System.out.println("The number is neither one nor two.");
                break;
        }
    }
}
