public class CheckingAccount extends Account {
    private double overdraftLimit;

    // Constructor
    public CheckingAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Method overriding for withdraw with overdraft protection
    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}
