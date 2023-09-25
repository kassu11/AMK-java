package object_oriented_programming.week_06.chapter_02.task_01.controller;

import object_oriented_programming.week_06.chapter_02.task_01.model.Currency;
import object_oriented_programming.week_06.chapter_02.task_01.view.CurrencyView;

public class CurrencyController {
    private CurrencyView view;
    private Currency currency = new Currency();

    public CurrencyController(CurrencyView view) {
        this.view = view;
    }

//    public void addTranslation(String word, String translation) {
//        System.out.println("Added translation: " + word + " -> " + translation);
//        if (word.isEmpty() || translation.isEmpty()) {
//            view.addingStatusLabel("Word or translation is empty");
//            System.out.println("Word or translation is empty");
//        } else if (currency.getTranslation(word) != null) {
//            view.addingStatusLabel("Word already exists");
//            System.out.println("Word already exists");
//        } else {
//            String message = String.format("Word \"%s\"added", word);
//            currency.addWord(word, translation);
//            view.addingStatusLabel(message);
//            System.out.println(message);
//        }
//    }

//    public void getTranslation(String word) {
//        if (word.isEmpty()) {
//            System.out.println("The search field is empty");
//            view.searchAnswer("The search field is empty");
//        } else if (currency.getTranslation(word) == null) {
//            String message = String.format("Word \"%s\" not found", word);
//            System.out.println(message);
//            view.searchAnswer(message);
//        } else {
//            String answer = String.format("Translation: %s", currency.getTranslation(word));
//            System.out.println(answer);
//            view.searchAnswer(answer);
//        }
//    }

    public static void main(String[] args) {
        CurrencyView.launch(CurrencyView.class);
    }
}
