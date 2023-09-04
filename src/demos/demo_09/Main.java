package demos.demo_09;

public class Main {
    public static void main(String[] args) {
        Singleton test = Singleton.getInstance("kassu");
        System.out.println(test.getName());
    }
}
