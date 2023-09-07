package demos.demo_11_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 1; i++) {
            try {
                System.out.print("Anna luku: ");
                int luku = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                scanner.nextLine();
                i--;
            }
            finally {
                System.out.println("Finally");
            }
        }
    }
}
