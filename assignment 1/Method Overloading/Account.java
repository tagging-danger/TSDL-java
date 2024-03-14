public class Account {
    protected double balance;

    // Constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to deposit
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Method to withdraw without specifying reason
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
