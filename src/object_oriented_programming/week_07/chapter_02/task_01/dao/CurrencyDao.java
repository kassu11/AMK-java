package object_oriented_programming.week_07.chapter_02.task_01.dao;

import object_oriented_programming.week_07.chapter_02.task_01.controller.CurrencyController;
import object_oriented_programming.week_07.chapter_02.task_01.datasource.MariaDbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrencyDao {
    private Map<String, Double> currencies = new HashMap<>();
    private Map<String, String> symbols = new HashMap<>();
    private List<String> currencyList = new ArrayList<>();
    private CurrencyController controller;

    public CurrencyDao(CurrencyController controller) {
        this.controller = controller;
        Connection conn = MariaDbConnection.getInstance(controller);

        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM currency");
            while (rs.next()) {
                String iso = rs.getString(1);
                String symbol = rs.getString(2);
                double rate = rs.getDouble(3);
                System.out.println(rate);
                currencies.put(iso, rate);
                symbols.put(iso, symbol);
                currencyList.add(iso);
            }
        } catch(Exception e) {
            controller.setErrorLable("Connection failed.");
        }
    }

    public double convert(double amount, String from, String to) {
        return amount / currencies.get(from) * currencies.get(to);
    }

    public String format(double amount, String to) {
        return String.format("%s %,.2f", symbols.get(to), amount);
    }

    public List<String> getCurrencies() {
        return currencyList;
    }
}
