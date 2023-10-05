package object_oriented_programming.week_07.chapter_04.task_01.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "currency")
public class Currency1 {
    @Id
    private String iso;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "rate")
    private double rate;

    public Currency1(String iso, String symbol, double rate) {
        super();
        this.iso = iso;
        this.symbol = symbol;
        this.rate = rate;
    }

    public Currency1() {

    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
