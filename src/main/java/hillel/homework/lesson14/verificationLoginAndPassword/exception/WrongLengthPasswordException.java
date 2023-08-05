package hillel.homework.lesson14.verificationLoginAndPassword.exception;

public class WrongLengthPasswordException extends RuntimeException {
    public WrongLengthPasswordException(String message) {
        super(message);
    }
}
