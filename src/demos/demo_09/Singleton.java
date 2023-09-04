package demos.demo_09;

public class Singleton {
    private String name;
    private static Singleton INSTANCE = null;
    private Singleton(String name) {
        this.name = name;
    }

    public static Singleton getInstance(String name) {
        if (INSTANCE == null) {
            INSTANCE = new Singleton(name);
        }

        return INSTANCE;
    }

    public String getName() {
        return this.name;
    }
}
