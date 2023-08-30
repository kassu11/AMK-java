package object_oriented_programming.week_02.chapter_01.task_03;

public class CoffeeMaker {
    private String type;
    private int amount = 10;
    private boolean state = true;

    public void changeAmount(int num) {
        if(num < 10 || num > 80 || !this.state) return;
        this.amount = num;
    }

    public void changeType(String newType) {
        if (newType.compareTo("normal") != 0 && newType.compareTo("espresso") != 0) return;
        this.type = newType;
    }

    public void onOff() {
        this.state = !this.state;
    }
}
