package Exercise_01.Chapter_01;

public class Task_04 { // I'm cat
    private String name;

    public Task_04(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        Task_04 cat = new Task_04("Whiskers");
        Task_04 catRex = new Task_04("Rex");

        // Call the meow method on the cat instance
        cat.meow();
        cat.meow();
        catRex.meow();
        cat.meow();
    }
}
