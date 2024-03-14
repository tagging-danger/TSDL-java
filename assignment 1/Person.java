public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an instance of Person
        Person person1 = new Person("Prathamesh Nagpure", 20);

        // Displaying information about the person
        System.out.println("Information about person 1:");
        person1.displayInfo();

        // Creating another instance of Person
        Person person2 = new Person("Dhruvi Tonemare", 19);

        // Displaying information about the second person
        System.out.println("\nInformation about person 2:");
        person2.displayInfo();
    }
}
