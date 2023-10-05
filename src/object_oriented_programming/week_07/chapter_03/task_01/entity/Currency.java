package object_oriented_programming.week_07.chapter_03.task_01.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "currency")
public class Currency {
    @Id
    private String iso;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "rate")
    private double rate;

    public Currency(String iso, String symbol, double rate) {
        super();
        this.iso = iso;
        this.symbol = symbol;
        this.rate = rate;
    }

    public Currency() {

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
