public class Main {
    public static void main(String[] args) {
        // Creating a Student
        Student student1 = new Student("Prathamesh Nagpure", 20, "123456", "Computer Science");
        student1.displayInfo();
        student1.enrollCourse("Java Programming");

        // Creating a GraduateStudent
        GraduateStudent gradStudent1 = new GraduateStudent("Dhruvi Tonemare", 19, "987654", "Physics", "Big Data");
        gradStudent1.displayInfo();
        gradStudent1.enrollCourse("Database Management System");
        gradStudent1.conductResearch();
    }
}
