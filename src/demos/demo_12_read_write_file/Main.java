package demos.demo_12_read_write_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("C:\\Users\\kaspe\\IdeaProjects\\AMK-java\\src\\demos\\demo_12\\ruoka.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Tiedostoa ei löytynyt");
            System.exit(1);
        }
        BufferedReader br = new BufferedReader(fr);

        String rivi = null;
        do {
            try {
                rivi = br.readLine();
            } catch (IOException e) {
                System.out.println("Tiedostoa ei voi lukea");
                System.exit(2);
            }
            if (rivi != null) System.out.println(rivi);
        } while(rivi != null);
    }
}
