package Lesson12.Problem2;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException (String message) {
        super(message);
    }
}

class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}
