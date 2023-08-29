package object_oriented_programming.week_02.task_01;

public class Television {
    private int channel;
    private boolean state = false;

    public void setChannel(int num) {
        this.channel = num;
        if (this.channel > 10) {
            this.channel = 1;
        }
    }

    public int getChannel() {
        return this.channel;
    }

    public boolean isOn() {
        return this.state;
    }

    public void pressOnOff() {
        this.state = !this.state;
    }
}
