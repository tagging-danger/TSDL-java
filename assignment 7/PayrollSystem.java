import java.sql.*;
import java.util.Scanner;

public class PayrollSystem {
    private static final String URL = "jdbc:mysql://localhost:3306/payroll";
    private static final String USER = "root";
    private static final String PASSWORD = "Dhruv2004";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root", "Dhruv2004")){
            // Add new employee to the system
            addEmployeeFromUserInput(conn);

            // Update salary details
            updateSalary(conn, 1, 5500.00);

            // Calculate monthly pay for employee with id 1
            double monthlyPay = calculateMonthlyPay(conn, 1);
            System.out.println("Monthly pay for employee with id 1: $" + monthlyPay);

            // Manage allowances and deductions
            updateAllowances(conn, 1, 250.00);
            updateDeductions(conn, 1, 150.00);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Function to add new employee using user input
    private static void addEmployeeFromUserInput(Connection conn) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Get employee details from user input
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter gender (M/F/O): ");
            String gender = scanner.nextLine().toUpperCase();

            // Validate gender input
            if (!gender.equals("M") && !gender.equals("F") && !gender.equals("O")) {
                throw new IllegalArgumentException("Invalid gender input.");
            }

            System.out.print("Enter contact number: ");
            String contactNumber = scanner.nextLine();

            // Validate contact number
            if (!contactNumber.matches("\\d{10}")) {
                throw new IllegalArgumentException("Invalid contact number. It should be a 10-digit number.");
            }

            System.out.print("Enter position: ");
            String position = scanner.nextLine();

            System.out.print("Enter allowances: ");
            double allowances = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter salary: ");
            double salary = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter deductions: ");
            double deductions = Double.parseDouble(scanner.nextLine());

            // Prepare and execute SQL statement to insert employee data
            String query = "INSERT INTO employees (name, age, gender, contact_number, position, allowances, salary, deductions) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setString(1, name);
                statement.setInt(2, age);
                statement.setString(3, gender);
                statement.setString(4, contactNumber);
                statement.setString(5, position);
                statement.setDouble(6, allowances);
                statement.setDouble(7, salary);
                statement.setDouble(8, deductions);
                statement.executeUpdate();
                System.out.println("Employee added successfully.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid age input. Please enter a valid integer value for age.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error occurred while adding employee: " + e.getMessage());
        }
    }

    // Function to update salary details
    private static void updateSalary(Connection conn, int employeeId, double newSalary) {
        try {
            String query = "UPDATE employees SET salary = ? WHERE id = ?";
            try (PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setDouble(1, newSalary);
                statement.setInt(2, employeeId);
                statement.executeUpdate();
                System.out.println("Salary updated successfully for employee with id " + employeeId);
            }
        } catch (SQLException e) {
            System.out.println("Error occurred while updating salary: " + e.getMessage());
        }
    }

    // Function to calculate monthly pay
    private static double calculateMonthlyPay(Connection conn, int employeeId) {
        try {
            String query = "SELECT salary, allowances, deductions FROM employees WHERE id = ?";
            try (PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setInt(1, employeeId);
                ResultSet result = statement.executeQuery();
                if (result.next()) {
                    double salary = result.getDouble("salary");
                    double allowances = result.getDouble("allowances");
                    double deductions = result.getDouble("deductions");
                    return salary + allowances - deductions;
                }
            }
            return 0.0;
        } catch (SQLException e) {
            System.out.println("Error occurred while calculating monthly pay: " + e.getMessage());
            return 0.0;
        }
    }

    // Function to update allowances
    private static void updateAllowances(Connection conn, int employeeId, double newAllowances) {
        try {
            String query = "UPDATE employees SET allowances = ? WHERE id = ?";
            try (PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setDouble(1, newAllowances);
                statement.setInt(2, employeeId);
                statement.executeUpdate();
                System.out.println("Allowances updated successfully for employee with id " + employeeId);
            }
        } catch (SQLException e) {
            System.out.println("Error occurred while updating allowances: " + e.getMessage());
        }
    }

    // Function to update deductions
    private static void updateDeductions(Connection conn, int employeeId, double newDeductions) {
        try {
            String query = "UPDATE employees SET deductions = ? WHERE id = ?";
            try (PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setDouble(1, newDeductions);
                statement.setInt(2, employeeId);
                statement.executeUpdate();
                System.out.println("Deductions updated successfully for employee with id " + employeeId);
            }
        } catch (SQLException e) {
            System.out.println("Error occurred while updating deductions: " + e.getMessage());
        }
    }
}
