package Lesson12.Problem2;

public class testClass {
    public static void main(String[] args) throws LowBalanceException, InsufficientBalanceException {
        CustomerAccount account = new CustomerAccount("John Doe", 100, 500);

        System.out.println("Initial Balance: " + account.getBalance());

        // Deposit money
        if (account.deposit(200)) {
            System.out.println("Deposit successful. Balance after deposit: " + account.getBalance());
        } else {
            System.out.println("Deposit failed.");
        }

        // Attempt to withdraw money
        if (account.withdraw(900)) {
            System.out.println("Withdraw successful. Balance after withdrawal: " + account.getBalance());
        } else {
            System.out.println("Withdraw failed. Balance: " + account.getBalance());
        }
    }
}
