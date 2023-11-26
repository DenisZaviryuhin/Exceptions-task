package app.app03;

public class InsufficientBalance  extends Exception{
    public InsufficientBalance(String message) {
        super(message);
    }
}
