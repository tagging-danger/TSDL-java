public class Main {
    public static void main(String[] args) {
        // Creating a CheckingAccount instance with $1000 balance and $500 overdraft limit
        CheckingAccount checkingAccount = new CheckingAccount(1000, 500);

        // Demonstrate method overriding for withdraw with overdraft protection
        checkingAccount.withdraw(800);
    }
}
