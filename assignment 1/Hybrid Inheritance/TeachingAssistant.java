public class TeachingAssistant extends GraduateStudent {
    private String taId;

    // Constructor
    public TeachingAssistant(String name, int age, String studentId, String major, String researchTopic, String taId) {
        super(name, age, studentId, major, researchTopic);
        this.taId = taId;
    }

    // Method to assist a professor
    public void assistProfessor() {
        System.out.println(getName() + " is assisting the professor.");
    }
}
