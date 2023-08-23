package demos;

import java.util.Scanner;

public class Demo_05_stringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer;
        do {
            System.out.println("Loop");
            System.out.print("Type y/n: ");
            answer = scanner.nextLine();
        } while (answer.compareTo("y") == 0);
    }
}
