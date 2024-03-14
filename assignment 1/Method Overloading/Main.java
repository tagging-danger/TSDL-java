public class Main {
    public static void main(String[] args) {
        // Creating a SavingsAccount instance
        SavingsAccount savingsAccount = new SavingsAccount(1000);

        // Demonstrate method overloading for withdraw
        savingsAccount.withdraw(500);
        savingsAccount.withdraw(200, "Emergency expense");
    }
}
