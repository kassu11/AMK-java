package object_oriented_programming.week_02.chapter_02.task_03;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();
    private Map<String, Double> costs = new HashMap<>();
    private Map<String, String> categories = new HashMap<>();

    public static void main(String[] args) {
        GroceryListManager listManager = new GroceryListManager();

        Scanner scanner = new Scanner(System.in);
        char answer;

        do {
            System.out.println("Settings");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Display list");
            System.out.println("4. Search item");
            System.out.println("5. Calculate total cost");
            System.out.println("6. Add item with category");
            System.out.println("7. Display by category");
            System.out.println("8. Exit");
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
            } else if (answer == '5') {
                System.out.printf("Total cost: %.2f\n", listManager.calculateTotalCost());
            } else if (answer == '6') {
                System.out.print("Enter item to add: ");
                String itemName = scanner.next();
                System.out.print("Enter item category: ");
                String category = scanner.next();
                listManager.addItemWithCategory(itemName, category);
            } else if (answer == '7') {
                System.out.print("Enter category: ");
                listManager.displayByCategory(scanner.next());
            } else if (answer == '8') {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice");
            }
        } while(answer != '8');
    }

    public void addItem(String item, double cost) {
        this.groceryList.add(item);
        this.costs.put(item, cost);
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

    public double calculateTotalCost() {
        double sum = 0;
        for(double value : this.costs.values()) {
            sum += value;
        }

        return sum;
    }

    public boolean checkItem(String item) {
        for(int i = 0; i < this.groceryList.size(); i++) {
            if (this.groceryList.get(i).equals(item)) {
                return true;
            }
        }

        return false;
    }

    public void addItemWithCategory(String item, String category) {
        this.groceryList.add(item);
        this.categories.put(item, category);
    }

    public void displayByCategory(String category) {
        System.out.println("Grocery List:");
        for(int i = 0; i < this.groceryList.size(); i++) {
            String item = this.groceryList.get(i);
            if (this.categories.containsKey(item)) {
                if (this.categories.get(item).equals(category)) {
                    System.out.printf("%d. %s\n", i + 1, item);
                }
            }
        }
        System.out.println();
    }
}
