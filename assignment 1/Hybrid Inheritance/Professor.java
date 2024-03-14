public class Professor extends Person {
    private String employeeId;
    private String department;
    private String teachingSubject;

    // Constructor
    public Professor(String name, int age, String employeeId, String department, String teachingSubject) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    // Method to conduct a lecture
    public void conductLecture() {
        System.out.println(getName() + " is conducting a lecture on " + teachingSubject);
    }
}
