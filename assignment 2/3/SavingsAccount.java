
class SavingsAccount extends Account {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Method overloading to specify reason for withdrawal
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn (Savings): $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

