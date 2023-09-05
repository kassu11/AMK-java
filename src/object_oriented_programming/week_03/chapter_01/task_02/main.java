package object_oriented_programming.week_03.chapter_01.task_02;

public class main {
    public static void main(String[] args) {
        Buss buss = new Buss("Bussi");

        buss.passengerEnter(10);
        System.out.println(buss.getNumberOfPassengers());
        buss.passengerExit(10);
        System.out.println(buss.getNumberOfPassengers());

    }
}
