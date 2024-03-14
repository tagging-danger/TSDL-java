import java.time.LocalDate;
class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private double salary;

    // Constructor
    public Employee(int employeeId, String firstName, String lastName, LocalDate dateOfBirth, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    // Accessor methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    // Mutator methods with validation
    public void setEmployeeId(int employeeId) {
        if (employeeId > 0) {
            this.employeeId = employeeId;
        } else {
            System.out.println("Invalid employee ID");
        }
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.trim().isEmpty()) {
            this.firstName = firstName;
        } else {
            System.out.println("Invalid first name");
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.trim().isEmpty()) {
            this.lastName = lastName;
        } else {
            System.out.println("Invalid last name");
        }
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if (dateOfBirth != null && dateOfBirth.isBefore(LocalDate.now())) {
            this.dateOfBirth = dateOfBirth;
        } else {
            System.out.println("Invalid date of birth");
        }
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }

    // Method to calculate yearly bonus
    public double calculateYearlyBonus() {
        // A simple example formula for bonus calculation
        return 0.1 * salary; // 10% of salary
    }
}