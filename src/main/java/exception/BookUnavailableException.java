package exception;

public class BookUnavailableException extends Exception {
    public BookUnavailableException() {
        super("The requested book is currently unavailable.");
    }

    public BookUnavailableException(String message) {
        super(message);
    }
}
