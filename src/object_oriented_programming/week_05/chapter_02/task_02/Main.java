package object_oriented_programming.week_05.chapter_02.task_02;

public class Main {
    public static void main(String[] args) {
        ThreadSafeArrayList<String> threadSafeList = new ThreadSafeArrayList<>();

        for(int i = 0; i < 1000; i++) {
            ThreadSafeArrayListMethods thread = new ThreadSafeArrayListMethods(threadSafeList);
            thread.addElement("Element " + i);
        }

        for(int i = 0; i < 1000; i++) {
            ThreadSafeArrayListMethods thread = new ThreadSafeArrayListMethods(threadSafeList);
            thread.addElement("Element " + i);
        }

        for(int i = 0; i < 1000; i++) {
            ThreadSafeArrayListMethods thread = new ThreadSafeArrayListMethods(threadSafeList);
            thread.removeElement("Element " + i);
        }

        ThreadSafeArrayListMethods thread = new ThreadSafeArrayListMethods(threadSafeList);
        threadSafeList.printSize("Not safe print size: ");
        thread.printSize("Safe print size: ");
    }
}
