package object_oriented_programming.week_07.chapter_04.task_01.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "from_iso")
    private String fromIso;

    @Column (name = "to_iso")
    private String toIso;

    @Column (name = "amount")
    private double amount;

    public Transaction(String fromIso, String toIso, double amount) {
        super();
        this.fromIso = fromIso;
        this.toIso = toIso;
        this.amount = amount;
    }

    public Transaction() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFromIso() {
        return fromIso;
    }

    public void setFromIso(String fromIso) {
        this.fromIso = fromIso;
    }

    public String getToIso() {
        return toIso;
    }

    public void setToIso(String toIso) {
        this.toIso = toIso;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
