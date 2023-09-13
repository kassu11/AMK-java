# Task 3: Serialization of Course Enrollment

Create a Java program that demonstrates the serialization and deserialization of a course enrollment system. You will create classes for students, courses, and enrollments, and then serialize and deserialize instances of these classes.

1. **Create a `Student` class** with the following attributes:
   - `id` (int)
   - `name` (String)
   - `age` (int)

2. **Create a `Course` class** with the following attributes:
   - `courseCode` (String)
   - `courseName` (String)
   - `instructor` (String)

3. **Create an `Enrollment` class** that represents the enrollment of a student in a course. It should have attributes:
   - `student` (Student)
   - `course` (Course)
   - `enrollmentDate` (String)

4. Implement constructors, getters, and setters for all classes.

5. **Create a `Main` class** with the `main` method to demonstrate serialization and deserialization. In the `main` method:
   - Create instances of `Student`, `Course`, and `Enrollment`.
   - Serialize and save the instances to a file named "enrollments.ser".
   - Deserialize the instances from the "enrollments.ser" file and print their information.

Here's a simplified example of how the code might look:

```java
import java.io.*;

class Student implements Serializable {
    // Attributes and methods
}

class Course implements Serializable {
    // Attributes and methods
}

class Enrollment implements Serializable {
    // Attributes and methods
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Student, Course, and Enrollment
        // Serialize and save the Enrollment instance
        // Deserialize and print the Enrollment instance
    }
}
```