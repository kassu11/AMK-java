package object_oriented_programming.week_03.chapter_04.task_03;

import java.io.*;

public class Main {
    private final static String FILENAME = "C:\\Users\\kaspe\\IdeaProjects\\AMK-java\\src\\object_oriented_programming\\week_03\\chapter_04\\task_03\\enrollments.ser";
    public static void main(String[] args) {
        File f = new File(FILENAME);

        Student student = new Student("John", 20);
        Course course = new Course("CSE 101", "Introduction to Computer Engineering", "John Doe");
        Enrollment enrollment = new Enrollment(student, course, "2020-10-10");

        // write object state to the file
        try (FileOutputStream outputstream = new FileOutputStream(FILENAME); ObjectOutputStream objects = new ObjectOutputStream(outputstream)) {
            objects.writeObject(enrollment);
        } catch (Exception e) {
            System.err.println("Writing enrollment: " + e);
        }

        Enrollment enrollment2 = null;

        if (f.exists() && f.isFile()) {
            try (FileInputStream inputstream = new FileInputStream(FILENAME); ObjectInputStream objects = new ObjectInputStream(inputstream)) {
                enrollment2 = (Enrollment) objects.readObject();
            } catch (Exception e) {
                System.err.println("Reading enrollment: " + e);
            }
        }

        System.out.println(enrollment2);
    }
}
