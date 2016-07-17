package exceptions;

/**
 * Created by gorobec on 17.07.16.
 */
public class PatientNotFoundException extends Exception {
    public PatientNotFoundException() {
    }

    public PatientNotFoundException(String message) {
        super(message);
    }
}
