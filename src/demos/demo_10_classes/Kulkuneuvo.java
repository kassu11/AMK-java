package demos.demo_10_classes;

public class Kulkuneuvo {
    private int nopeus, huippunopeus;

    public Kulkuneuvo(int huippunopeus) {
        this.huippunopeus = huippunopeus;
    }

    public void kiihdytä(int nopeudenMuutos) {
        this.nopeus += nopeudenMuutos;
        if (this.nopeus > huippunopeus) {
            this.nopeus = huippunopeus;
        }

        if (this.nopeus < 0) {
            this.nopeus = 0;
        }
    }
}
