package object_oriented_programming.week_08.chapter_01.task_01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s", name, age, city);
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alex", 30, "London"));
        people.add(new Person("John", 60, "Moscow"));
        people.add(new Person("Bob", 40, "Paris"));
        people.add(new Person("John", 20, "New York"));
        people.add(new Person("Mike", 70, "Tokyo"));
        people.add(new Person("Bob", 90, "Lviv"));
        people.add(new Person("Mike", 12, "Canada"));
        people.add(new Person("Alex", 80, "New York"));
        people.add(new Person("Jack", 50, "Berlin"));

        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("Sorted by age:");
        people.forEach(System.out::println);

        people = people.stream().filter((Person person) -> person.getCity().equals("New York")).toList();
        System.out.println("\nFiltered by \"New York\":");
        people.forEach(System.out::println);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
