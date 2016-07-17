package exceptions;

/**
 * Created by gorobec on 17.07.16.
 */
public class PatientCreationException extends Exception {
    public PatientCreationException() {
    }

    public PatientCreationException(String message) {
        super(message);
    }
}
