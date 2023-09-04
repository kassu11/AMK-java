package object_oriented_programming.week_02.chapter_02.task_05;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private Map<String, ShoppingList> lists = new HashMap<>();

    public static void main(String[] args) {
        GroceryListManager listManager = new GroceryListManager();

        Scanner scanner = new Scanner(System.in);
        int answer;

        do {
            System.out.println("Settings");
            System.out.println("1. Add shopping list");
            System.out.println("2. Select shopping list");
            System.out.println("3. Exit");
        
            System.out.print("Enter your choice: ");
            answer = scanner.nextInt();

            if (answer == 1) {
                System.out.print("Enter shopping list name: ");
                listManager.addShoppingList(scanner.next());
            } else if (answer == 2) {
                System.out.println("Available shopping lists: ");
                for (String listName : listManager.lists.keySet()) {
                    System.out.println(listName);
                }

                System.out.print("Enter shopping list name: ");
                listManager.selectShoppingList(scanner.next());
            } else if (answer == 3) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice");
            }
        } while(answer != 3);
    }

    public void addShoppingList(String name) {
        this.lists.put(name, new ShoppingList());
    }

    public void selectShoppingList(String name) {
        if (this.lists.containsKey(name)) this.lists.get(name).select();
    }
}
