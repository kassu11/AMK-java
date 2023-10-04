package object_oriented_programming.week_07.chapter_03.task_01.application;

import object_oriented_programming.week_07.chapter_03.task_01.dao.CurrencyDao;
import object_oriented_programming.week_07.chapter_03.task_01.entity.Currency;

public class CurrencyApp {
    public static void main(String[] args) {
        CurrencyDao dao = new CurrencyDao();
        dao.persist(new Currency("---", "$", 1.0));
        Currency currency = dao.find("---");
        System.out.println(currency.getIso() + " " + currency.getSymbol() + " " + currency.getRate());

        currency.setRate(2.0);
        dao.update(currency);
        currency = dao.find("---");
        System.out.println(currency.getIso() + " " + currency.getSymbol() + " " + currency.getRate());

        dao.delete(currency);
    }

}
