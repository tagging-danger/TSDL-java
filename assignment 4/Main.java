public class Main {
    public static void main(String[] args) {
        // Thread Attendance for different classes
        ThreadAttendance class1Attendance = new ThreadAttendance("Java");
        ThreadAttendance class2Attendance = new ThreadAttendance("DBMS");

        // Mark attendance for class 1
        class1Attendance.markAttendance("Pratham");
        class1Attendance.markAttendance("Om");
        class1Attendance.markAttendance("Pratik");

        // Mark attendance for class 2
        class2Attendance.markAttendance("Dhruvi");
        class2Attendance.markAttendance("Akshata");

        // Start thread attendance
        class1Attendance.start();
        class2Attendance.start();

        // Runnable Attendance for different students
        RunnableAttendance student1Attendance = new RunnableAttendance("Samruddhi");
        RunnableAttendance student2Attendance = new RunnableAttendance("Vedant");

        // Execute student attendance using a single thread
        Thread studentThread = new Thread(student1Attendance);
        studentThread.start();
        studentThread = new Thread(student2Attendance);
        studentThread.start();
    }
}