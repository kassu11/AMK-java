package object_oriented_programming.week_07.chapter_01.task_01.controller;

import object_oriented_programming.week_07.chapter_01.task_01.model.Currency;
import object_oriented_programming.week_07.chapter_01.task_01.view.CurrencyView;

public class CurrencyController {
    private CurrencyView view;
    private Currency currency = new Currency();

    public CurrencyController(CurrencyView view) {
        this.view = view;
    }

    public void convert(double amount, String from, String to) {
        double result = currency.convert(amount, from, to);
        view.convertAnswer(currency.format(result, to));
    }

    public static void main(String[] args) {
        CurrencyView.launch(CurrencyView.class);
    }
}
