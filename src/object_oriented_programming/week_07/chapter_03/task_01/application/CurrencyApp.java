package object_oriented_programming.week_07.chapter_03.task_01.application;

import object_oriented_programming.week_07.chapter_03.task_01.view.CurrencyView;
import object_oriented_programming.week_07.chapter_03.task_01.dao.CurrencyDao;
import object_oriented_programming.week_07.chapter_03.task_01.entity.Currency;

import java.util.List;

public class CurrencyApp {
    private CurrencyView view;
    private CurrencyDao dao;

    public CurrencyApp(CurrencyView view) {
        this.view = view;
        this.dao = new CurrencyDao();
    }
    public static void main(String[] args) {
//        CurrencyDao dao = new CurrencyDao();
//        dao.persist(new Currency("---", "$", 1.0));
//        Currency currency = dao.find("---");
//        System.out.println(currency.getIso() + " " + currency.getSymbol() + " " + currency.getRate());
//
//        currency.setRate(2.0);
//        dao.update(currency);
//        currency = dao.find("---");
//        System.out.println(currency.getIso() + " " + currency.getSymbol() + " " + currency.getRate());
//
//        dao.delete(currency);
//
//        for(Currency c : dao.getAll()) {
//            System.out.println(c.getIso() + " " + c.getSymbol() + " " + c.getRate());
//        }

        CurrencyView.launch(CurrencyView.class, args);
    }

    public List<Currency> getAllCurrencies() {
        return dao.getAll();
    }

    public void convertCurrency(double startValue, String startCurrency, String endCurrency) {
        Currency start = dao.find(startCurrency);
        Currency end = dao.find(endCurrency);
        double result = startValue / start.getRate() * end.getRate();
        view.setEndCurrencyTextField(String.format("%s %.2f", end.getSymbol(), result));
    }

    public void addCurrency(String iso, String symbol, double rate) {
        dao.persist(new Currency(iso, symbol, rate));
    }

}
