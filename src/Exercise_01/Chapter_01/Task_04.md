# Task 4

Here is a simple object-oriented program:

```java
public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        Cat cat = new Cat("Whiskers");

        // Call the meow method on the cat instance
        cat.meow();
    }
}
```

Run the program. Then, based on your previous programming experience, modify the main method so that two cat objects are created, and the program behaves in the following way:

```
The cat named Whiskers says: Meow!
The cat named Whiskers says: Meow!
The cat named Rex says: Meow!
The cat named Whiskers says: Meow!
```