# Task 3

Run the following Java program that asks the user three integers and prints their sum.

```java
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));
    }
}
```

Then, based on your previous programming experience, modify the program so that the program also prints the product and average of the three integers. Hint: try the modified program with integers 3, 4, and 6. The sum should be 13, the product 72, and the average 4.3333333333333. If the average is something else, find out why and modify the program accordingly. Add the explanation as a comment to the program. Commit your changes to GitHub.