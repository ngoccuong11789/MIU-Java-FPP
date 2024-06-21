package Lesson12.Problem2;

import java.awt.image.BandCombineOp;

public class CustomerAccount {
    private String Cus_name;
    private int Acc_No;
    private double Balance;

    public CustomerAccount(String Cus_name, int Acc_No, double Balance) {
        this.Cus_name = Cus_name;
        this.Acc_No = Acc_No;
        this.Balance = Balance;
    }

    public boolean deposit(double amount) {
        if(amount > 0) {
            Balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw (double amount) throws InsufficientBalanceException, LowBalanceException {
        try {
            if(amount > Balance) {
                throw new InsufficientBalanceException("Withdraw amount exceed the balance");
            } else if(Balance - amount < 100){
                throw new LowBalanceException("Balance reach below 100$.");
            } else {
                Balance -= amount;
                return true;
            }
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        } catch (LowBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        }

    }

    public double getBalance() {
        return Balance;
    }

}
