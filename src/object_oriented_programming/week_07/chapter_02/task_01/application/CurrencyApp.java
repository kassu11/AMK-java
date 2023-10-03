package object_oriented_programming.week_07.chapter_02.task_01.application;

import object_oriented_programming.week_07.chapter_02.task_01.dao.CurrencyDao;
import object_oriented_programming.week_07.chapter_02.task_01.view.CurrencyView;

public class CurrencyApp {
    private CurrencyView view;
    private CurrencyDao currency;

    public CurrencyApp(CurrencyView view) {
        this.view = view;
        this.currency = new CurrencyDao(this);
    }

    public void convert(double amount, String from, String to) {
        double result = currency.convert(amount, from, to);
        view.convertAnswer(currency.format(result, to));
    }

    public static void main(String[] args) {
        CurrencyView.launch(CurrencyView.class);
    }

    public CurrencyDao getCurrency() {
        return currency;
    }

    public void setErrorLable(String message) {
        this.view.setErrorLabel(message);
    }
}
