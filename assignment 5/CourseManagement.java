import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CourseManagement {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Course");
            System.out.println("2. Enroll Student");
            System.out.println("3. Display Courses and Students Enrolled");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter course ID: ");
                    int courseId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter course name: ");
                    String courseName = scanner.nextLine();
                    courses.add(new Course(courseId, courseName));
                    System.out.println("Course added successfully!");
                    break;
                case 2:
                    System.out.print("Enter course ID to enroll student: ");
                    int enrollCourseId;
                    while (true) {
                        try {
                            enrollCourseId = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Please enter a valid course ID (a number):");
                            scanner.next(); // Consume invalid input
                        }
                    }
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int studentId;
                    while (true) {
                        try {
                            studentId = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Please enter a valid student ID (a number):");
                            scanner.next(); // Consume invalid input
                        }
                    }
                    scanner.nextLine(); // Consume newline
                    boolean courseFound = false;
                    for (Course course : courses) {
                        if (course.getCourseId() == enrollCourseId) {
                            course.addStudent(studentName, studentId);
                            courseFound = true;
                            break;
                        }
                    }
                    if (!courseFound) {
                        System.out.println("Course not found!");
                    } else {
                        System.out.println("Student enrolled successfully!");
                    }
                    break;
                case 3:
                    System.out.println("Courses and Students Enrolled:");
                    for (Course course : courses) {
                        System.out.println("Course ID: " + course.getCourseId() + ", Course Name: " + course.getCourseName());
                        ArrayList<String> students = course.getStudentsEnrolled();
                        if (students.isEmpty()) {
                            System.out.println("No students enrolled.");
                        } else {
                            System.out.println("Students Enrolled:");
                            for (String student : students) {
                                System.out.println(student);
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
