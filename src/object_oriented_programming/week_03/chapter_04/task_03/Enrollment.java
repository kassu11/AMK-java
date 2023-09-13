package object_oriented_programming.week_03.chapter_04.task_03;

import java.io.Serializable;
public class Enrollment implements Serializable{
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment() {
        this.student = new Student();
        this.course = new Course();
        this.enrollmentDate = "";
    }

    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public String toString() {
        return "# Student\n" + this.student + "\n"
                + "# Course\n" + this.course + "\n"
                + "Enrollment date: " + this.enrollmentDate + "\n";
    }
}
