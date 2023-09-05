package object_oriented_programming.week_03.chapter_01.task_02;

public class main {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("Fast car");
        sportsCar.fillTank();
        for(int i = 0; i < 8; i++) {
            sportsCar.accelerate();
            System.out.println(sportsCar.getSpeed() + " km");
        }
    }
}
