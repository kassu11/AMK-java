package object_oriented_programming.week_06.chapter_02.task_01.model;

import java.util.HashMap;
import java.util.Map;

public class Currency {
    private Map<String, Double> currencies = new HashMap<>();

    public Currency() {
        currencies.put("USD", 1.0);
        currencies.put("EUR", 0.94);
        currencies.put("JPY", 148.79);
        currencies.put("GBP", 0.82);
    }

    public double convert(double amount, String from, String to) {
        return amount / currencies.get(from) * currencies.get(to);
    }
}
