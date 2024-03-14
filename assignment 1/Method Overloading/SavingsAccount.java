public class SavingsAccount extends Account {
    // Constructor
    public SavingsAccount(double balance) {
        super(balance);
    }

    // Method overloading for withdraw with reason
    public void withdraw(double amount, String reason) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " for " + reason);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
