package simulation.exercise_02;

public class Task_03 {
    public static void main(String[] args) {
        double[][] ages = {
                {19, .05},
                {20, .1},
                {21, .1},
                {22, .2},
                {25, .3},
                {26, .2},
                {30, .05},
        };

        int[] ageSums = new int[32];

        for(int i = 0; i < 10000; i++) {
            double r = Math.random();
            double sum = 0.0;
            for(double[] age: ages) {
                sum += age[1];
                int index = (int)age[0];
                if(sum >= r) {
                    ageSums[index] += 1;
                    break;
                }
            }
        }

        for(int i = 15; i < ageSums.length; i++) {
            if (ageSums[i] == 0) continue;
            System.out.printf("Age %d count is: %.2f\n", i, ageSums[i] / 10000.0);
        }
    }
}
