public class Student extends Person {
    private String studentId;
    private String major;

    // Constructor
    public Student(String name, int age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    // Method to enroll in a course
    public void enrollCourse(String courseName) {
        System.out.println(" is now enrolled in " + courseName);
    }
}
