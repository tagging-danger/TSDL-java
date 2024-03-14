public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1000);
        acc1.deposit(500);
        acc1.withdraw(200,"");

        SavingsAccount savingsAcc = new SavingsAccount(2000);
        savingsAcc.deposit(100);
        savingsAcc.withdraw(500, "emergency");
    }
}