
public class Main {
    public static void main(String[] args) {
        // Instantiate objects for both SavingsAccount and CheckingAccount
        SavingsAccount savingsAcc = new SavingsAccount(2000);
        CheckingAccount checkingAcc = new CheckingAccount(2000, 500); // Initial balance and overdraft limit

        // Illustrate polymorphism by invoking the withdraw() method on both objects
        // Highlighting distinct behaviors based on the account type
        Account acc1 = savingsAcc;
        Account acc2 = checkingAcc;

        acc1.withdraw(500); // Will call withdraw() from SavingsAccount
        acc2.withdraw(800); // Will call withdraw() from CheckingAccount
    }
}
