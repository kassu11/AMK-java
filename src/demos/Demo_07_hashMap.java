package demos;

import java.util.HashMap;
import java.util.Map;

public class Demo_07_hashMap {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("kassu", 5);

        System.out.print(scores.get("kassu").intValue());
    }
}
