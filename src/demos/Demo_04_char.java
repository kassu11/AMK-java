package demos;

import java.util.Scanner;

public class Demo_04_char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char answer;
        do {
            System.out.println("Loop");
            System.out.print("Type y/n: ");
            answer = scanner.next().charAt(0);
        } while (answer == 'y');
    }
}
