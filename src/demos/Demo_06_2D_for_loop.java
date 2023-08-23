package demos;

import java.util.Scanner;

public class Demo_06_2D_for_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int WIDTH = 20, HEIGHT = 5;

        for(int y = 0; y < HEIGHT; y++) {
            for(int x = 0; x < WIDTH; x++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
