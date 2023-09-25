package object_oriented_programming.week_06.chapter_01.task_01.model;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> dictionary = new HashMap<>();

    public void addWord(String word, String translation) {
        dictionary.put(word, translation);
    }

    public String getTranslation(String word) {
        return dictionary.get(word);
    }
}
