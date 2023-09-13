package object_oriented_programming.week_03.chapter_04.task_03;

import java.io.Serializable;
public class Course implements Serializable {
    private String courseCode;
    private String courseName;
    private String instructor;

    public Course() {
        this.courseCode = "";
        this.courseName = "";
        this.instructor = "";
    }

    public Course(String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course code: " + this.courseCode + "\n"
                + "Course name: " + this.courseName + "\n"
                + "Instructor: " + this.instructor + "\n";
    }
}
