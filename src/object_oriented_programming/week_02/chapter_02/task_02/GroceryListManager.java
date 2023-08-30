package object_oriented_programming.week_02.chapter_02.task_02;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    public static void main(String[] args) {
        GroceryListManager listManager = new GroceryListManager();
        Map<String, Double> costs = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        char answer;

        do {
            System.out.println("Settings");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Display list");
            System.out.println("4. Search item");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            answer = scanner.next().charAt(0);

            if (answer == '1') {
                System.out.print("Enter item to add: ");
                String itemName = scanner.next();
                System.out.print("Enter item price: ");
                double cost = scanner.nextDouble();
                listManager.addItem(itemName, cost);
            } else if (answer == '2') {
                System.out.print("Enter item to remove: ");
                listManager.removeItem(scanner.next());
            } else if (answer == '3') {
                listManager.displayList();
            } else if (answer == '4') {
                System.out.print("Enter item to search: ");
                System.out.println(listManager.checkItem(scanner.next()) ? "Item found" : "Item not found");
            }
        } while(answer != '5');
    }

    public void addItem(String item, double cost) {
        this.groceryList.add(item);
    }

    public void removeItem(String item) {
        for(int i = 0; i < this.groceryList.size(); i++) {
            if (this.groceryList.get(i).equals(item)) {
                this.groceryList.remove(i);
                break;
            }
        }
    }

    public void displayList() {
        System.out.println("Grocery List:");
        for(int i = 0; i < this.groceryList.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, this.groceryList.get(i));
        }
        System.out.println();
    }

    public boolean checkItem(String item) {
        for(int i = 0; i < this.groceryList.size(); i++) {
            if (this.groceryList.get(i).equals(item)) {
                return true;
            }
        }

        return false;
    }
}
