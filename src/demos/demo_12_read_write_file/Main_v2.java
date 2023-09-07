package demos.demo_12_read_write_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main_v2 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:\\Users\\kaspe\\IdeaProjects\\AMK-java\\src\\demos\\demo_12\\ruoka.txt"); BufferedReader br = new BufferedReader(fr)) {
            String rivi = null;
            do {
                rivi = br.readLine();
                if (rivi != null) System.out.println(rivi);
            } while(rivi != null);

        } catch (IOException e) {
            System.out.println("Tiedoston käsittely epäonnistui");
            System.exit(1);
        }
    }
}
