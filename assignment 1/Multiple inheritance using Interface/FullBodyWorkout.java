public class FullBodyWorkout implements CardioWorkout, StrengthTraining {
    private String workoutName;
    private int durationMinutes;
    private String equipmentUsed;
    private String instructorName;

    // Constructor
    public FullBodyWorkout(String workoutName, int durationMinutes, String equipmentUsed, String instructorName) {
        this.workoutName = workoutName;
        this.durationMinutes = durationMinutes;
        this.equipmentUsed = equipmentUsed;
        this.instructorName = instructorName;
    }

    @Override
    public String getWorkoutName() {
        return workoutName;
    }

    @Override
    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public String getEquipmentUsed() {
        return equipmentUsed;
    }

    @Override
    public String getInstructorName() {
        return instructorName;
    }

    @Override
    public void displayWorkoutDetails() {
        System.out.println("Workout Name: " + workoutName);
        System.out.println("Duration: " + durationMinutes + " minutes");
    }

    @Override
    public void displayStrengthTrainingDetails() {
        System.out.println("Equipment Used: " + equipmentUsed);
        System.out.println("Instructor: " + instructorName);
    }
}
