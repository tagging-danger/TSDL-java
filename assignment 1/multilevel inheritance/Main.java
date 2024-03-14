public class Main {
    public static void main(String[] args) {
        // Creating a Student
        Student student1 = new Student("John Doe", 20, "123456", "Computer Science");
        student1.displayInfo();
        student1.enrollCourse("Java Programming");

        // Creating a GraduateStudent
        GraduateStudent gradStudent1 = new GraduateStudent("Jane Smith", 25, "987654", "Physics", "Quantum Mechanics");
        gradStudent1.displayInfo();
        gradStudent1.enrollCourse("Advanced Quantum Theory");
        gradStudent1.conductResearch();
    }
}
