package demos.demo_10_classes;

public class Simulaatio {

    public static void main(String[] args) {
        Fillari fillari = new Fillari(8, 10);
        Spora spora = new Spora(72);

        spora.kiihdytä(30);
        spora.kiihdytä(-5);
    }
}
