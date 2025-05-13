import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("Mathematics", 85);
        Course c2 = new Course("Physics", 32);
        Course c3 = new Course("Chemistry", 70);
        Course c4 = new Course("Biology", 25);

        List<Course> courseList = Arrays.asList(c1, c2, c3, c4);

        Student student = new Student("John Doe", "BSc", 2, courseList);

        // 1. Retrieve student details
        student.displayStudentInfo();

        // 2. Retrieve failed subjects
        System.out.println("\nCourses with marks < 40:");
        student.displayFailedCourses();
    }
}
