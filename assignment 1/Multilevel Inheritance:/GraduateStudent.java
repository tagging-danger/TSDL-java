public class GraduateStudent extends Student {
    private String researchTopic;

    // Constructor
    public GraduateStudent(String name, int age, String studentId, String major, String researchTopic) {
        super(name, age, studentId, major);
        this.researchTopic = researchTopic;
    }

    // Method to conduct research
    public void conductResearch() {
        System.out.println(getName() + " is conducting research on " + researchTopic);
    }
}
