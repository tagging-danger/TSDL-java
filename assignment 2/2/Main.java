public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(000);
        acc1.deposit(500);
        acc1.withdraw(2000);

        CheckingAccount checkingAcc = new CheckingAccount(000, 00); // Initial balance and overdraft limit
        checkingAcc.deposit(100);
        checkingAcc.withdraw(250); // Within overdraft limit
        checkingAcc.withdraw(300); // Exceeds overdraft limit
    }
}