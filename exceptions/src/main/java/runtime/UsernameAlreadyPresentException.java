package runtime;

public class UsernameAlreadyPresentException extends RuntimeException {
    public UsernameAlreadyPresentException(String message) {
        super(message);
    }
}
