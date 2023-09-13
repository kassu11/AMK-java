package object_oriented_programming.week_03.chapter_04.task_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Double> temperatures = new ArrayList<>();
    private static double sum = 0.0;
    private static int count = 0;

    public static void main(String[] args) {
        String path = "C:\\Users\\kaspe\\IdeaProjects\\AMK-java\\src\\object_oriented_programming\\week_03\\chapter_04\\task_01\\korvike.csv";
        try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)) {
            String rivi = null;
            do {
                rivi = br.readLine();
                if (rivi != null) parseRow(rivi);
            } while(rivi != null);

            System.out.printf("Päivän 1.1.2023 keskilämpötila on: %.3f", sum / count);

        } catch (IOException e) {
            System.out.println("Tiedoston käsittely epäonnistui");
            System.exit(1);
        }
    }

    static void parseRow(String row) {
        String[] values = row.split(",");
        if(values[0].equals("1.1.2023")) {
            sum += Double.parseDouble(values[3]);
            count++;
        }
    }
}
