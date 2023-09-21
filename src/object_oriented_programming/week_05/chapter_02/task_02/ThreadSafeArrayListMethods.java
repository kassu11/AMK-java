package object_oriented_programming.week_05.chapter_02.task_02;

public class ThreadSafeArrayListMethods extends Thread {
    private final ThreadSafeArrayList<String> LIST;
    private Type type;
    private String value;

    public ThreadSafeArrayListMethods(ThreadSafeArrayList<String> list) {
        LIST = list;
    }

    enum Type {
        ADD,
        REMOVE,
        PRINT_SIZE
    }

    public void addElement(String str) {
        this.type = Type.ADD;
        this.value = str;
        this.start();
    }

    public void removeElement(String str) {
        this.type = Type.REMOVE;
        this.value = str;
        this.start();
    }

    public void printSize(String flavorText) {
        this.type = Type.PRINT_SIZE;
        this.value = flavorText;
        this.start();
    }

    public void run() {
        switch(this.type) {
            case ADD -> LIST.addElement(this.value);
            case REMOVE -> LIST.removeElement(this.value);
            case PRINT_SIZE -> LIST.printSize(this.value);
        }
    }
}
