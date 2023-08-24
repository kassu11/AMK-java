package simulation.exercise_01.task_03;

public class Customer {
    private static int nextId = 1;
    private int id;
    long startTime, endTime;

    public Customer() {
        System.out.println(nextId);
        this.id = nextId++;
    }

    public static void main(String[] args) {
        System.out.println("Load");

        Customer asiakas1 = new Customer();
        Customer asiakas2 = new Customer();
        Customer asiakas3 = new Customer();
        Customer asiakas4 = new Customer();

        System.out.println(asiakas1.id + "asdasd" + asiakas3.id);

    }
}