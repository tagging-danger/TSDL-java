import java.util.ArrayList;
import java.util.List;

class ThreadAttendance extends Thread {
    private String className;
    private List<String> presentStudents;

    public ThreadAttendance(String className) {
        this.className = className;
        this.presentStudents = new ArrayList<>();
    }

    public void markAttendance(String studentName) {
        presentStudents.add(studentName);
    }

    @Override
    public void run() {
        System.out.println("Attendance for class " + className + ":");
        for (String student : presentStudents) {
            System.out.println(student);
        }
    }
}