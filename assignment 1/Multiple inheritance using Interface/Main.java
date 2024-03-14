public class Main {
    public static void main(String[] args) {
        // Creating a FullBodyWorkout instance
        FullBodyWorkout workout = new FullBodyWorkout("Full Body Workout", 60, "Dumbbells", "Prathamesh Nagpure");

        // Displaying workout details
        System.out.println("Workout Details:");
        workout.displayWorkoutDetails();
        workout.displayStrengthTrainingDetails();
    }
}
