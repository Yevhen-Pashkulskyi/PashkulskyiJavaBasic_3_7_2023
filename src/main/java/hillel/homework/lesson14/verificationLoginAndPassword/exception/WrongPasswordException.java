package hillel.homework.lesson14.verificationLoginAndPassword.exception;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String message) {
        super(message);
    }
}
