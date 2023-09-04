package demos;

import eduni.distributions.*;

public class Demo_08_eduni {
    public static void main(String[] args) {
        Normal test = new Normal(10, 100);
        for(int i = 0; i < 10; i++) {
            double t = test.sample();
            System.out.println(t);
        }

    }
}
