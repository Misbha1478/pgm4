import java.util.List;

public class Student {
    private String name;
    private String program;
    private int semester;
    private List<Course> courses;

    public Student(String name, String program, int semester, List<Course> courses) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = courses;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Courses Registered:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }

    public void displayFailedCourses() {
        for (Course course : courses) {
            if (course.getMarks() < 40) {
                System.out.println(name + " has scored " + course.getMarks() +
                                   " in " + course.getCourseName());
            }
        }
    }
}
