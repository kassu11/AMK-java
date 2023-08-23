package demos;

import java.util.Scanner;

public class Demo_01_scanner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Give your name: ");
        String name = reader.nextLine();

        System.out.println("Hello " + name);
    }
}
