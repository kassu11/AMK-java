package object_oriented_programming.week_05.chapter_02.task_02;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeArrayList<E> {
    private final List<E> LIST = new ArrayList<>();


    public synchronized void addElement(E str) {
        LIST.add(str);
    }

    public synchronized void removeElement(E str) {
        LIST.remove(str);
    }

    public synchronized void printSize(String flavorText) {
        System.out.println(flavorText + LIST.size());
    }
}
