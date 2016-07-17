package exceptions;

/**
 * Created by gorobec on 17.07.16.
 */
public class LoginException extends Exception {
    public LoginException() {
    }

    public LoginException(String message) {
        super(message);
    }
}
