package object_oriented_programming.week_02.chapter_01.task_03;

public class CoffeeMaker {
    private String type;
    private int amount = 10;
    private boolean state = true;

    public void changeAmount(int num) {
        if(num < 10 || num > 80 || !this.state) return;
        this.amount = num;
        System.out.println("Amount of coffee: " + this.amount + " ml");
    }

    public void changeType(String newType) {
        if(!this.state) return;
        if(newType.equals("normal") || newType.equals("espresso")) {
            this.type = newType;
            System.out.println("Type of coffee: " + this.type);
        }
    }

    public void onOff() {
        this.state = !this.state;
        System.out.println("Coffee maker is " + (this.state ? "on" : "off"));
    }

    public String getType() {
        return this.type;
    }
}
