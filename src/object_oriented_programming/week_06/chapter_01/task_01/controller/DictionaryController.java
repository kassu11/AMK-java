package object_oriented_programming.week_06.chapter_01.task_01.controller;

import demos.demo_14_Maven.view.DiceGUI;
import object_oriented_programming.week_06.chapter_01.task_01.model.Dictionary;
import object_oriented_programming.week_06.chapter_01.task_01.view.DictionaryView;

public class DictionaryController {
    private DictionaryView view;
    private Dictionary dictionary = new Dictionary();

    public DictionaryController(DictionaryView view) {
        this.view = view;
    }

    public void addTranslation(String word, String translation) {
        System.out.println("Added translation: " + word + " -> " + translation);
        if (word.isEmpty() || translation.isEmpty()) {
            view.addingStatusLabel("Word or translation is empty");
            System.out.println("Word or translation is empty");
        } else if (dictionary.getTranslation(word) != null) {
            view.addingStatusLabel("Word already exists");
            System.out.println("Word already exists");
        } else {
            String message = String.format("Word \"%s\"added", word);
            dictionary.addWord(word, translation);
            view.addingStatusLabel(message);
            System.out.println(message);
        }
    }

    public void getTranslation(String word) {
        if (word.isEmpty()) {
            System.out.println("The search field is empty");
            view.searchAnswer("The search field is empty");
        } else if (dictionary.getTranslation(word) == null) {
            String message = String.format("Word \"%s\" not found", word);
            System.out.println(message);
            view.searchAnswer(message);
        } else {
            String answer = String.format("Translation: %s", dictionary.getTranslation(word));
            System.out.println(answer);
            view.searchAnswer(answer);
        }
    }

    public static void main(String[] args) {
        DictionaryView.launch(DictionaryView.class);
    }
}
