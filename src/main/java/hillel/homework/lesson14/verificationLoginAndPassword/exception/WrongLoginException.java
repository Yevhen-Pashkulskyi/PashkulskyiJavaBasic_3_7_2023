package hillel.homework.lesson14.verificationLoginAndPassword.exception;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String message) {
        super(message);
    }
}
