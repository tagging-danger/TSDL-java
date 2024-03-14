import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        // Create an employee object
        Employee employee = new Employee(1, "John", "Doe", LocalDate.of(1990, 5, 15), 50000);

        // Demonstrate accessing attributes
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Date of Birth: " + employee.getDateOfBirth());
        System.out.println("Salary: $" + employee.getSalary());

        // Demonstrate modifying attributes
        employee.setEmployeeId(2);
        employee.setFirstName("Jane");
        employee.setLastName("Smith");
        employee.setDateOfBirth(LocalDate.of(1985, 8, 20));
        employee.setSalary(60000);

        // Demonstrate accessing modified attributes
        System.out.println("\nModified Employee Details:");
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Date of Birth: " + employee.getDateOfBirth());
        System.out.println("Salary: $" + employee.getSalary());

        // Demonstrate calculating yearly bonus
        double yearlyBonus = employee.calculateYearlyBonus();
        System.out.println("\nYearly Bonus: $" + yearlyBonus);
    }
}
