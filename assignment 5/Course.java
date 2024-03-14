import java.util.ArrayList;

public class Course {
    private int courseId;
    private String courseName;
    private ArrayList<String> studentsEnrolled;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.studentsEnrolled = new ArrayList<>();
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<String> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void addStudent(String studentName, int studentId) {
        String studentDetails = studentName + " (" + studentId + ")";
        studentsEnrolled.add(studentDetails);
    }
}
