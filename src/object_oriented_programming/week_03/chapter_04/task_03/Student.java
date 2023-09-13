package object_oriented_programming.week_03.chapter_04.task_03;

import java.io.Serializable;
public class Student implements Serializable {
    private static int studentCount = 0;
    private int id;
    private String name;
    private int age;

    public Student() {
        this.name = "";
        this.age = 0;
        this.id = ++studentCount;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++studentCount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student ID: " + this.id + "\n"
                + "Student name: " + this.name + "\n"
                + "Student age: " + this.age + "\n";
    }
}
