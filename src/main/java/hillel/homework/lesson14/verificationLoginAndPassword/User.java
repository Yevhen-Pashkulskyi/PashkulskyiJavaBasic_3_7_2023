package hillel.homework.lesson14.verificationLoginAndPassword;

import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongEqualsPasswordException;
import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongLoginException;
import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongLengthPasswordException;
import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongPasswordException;

public class User {
    private static final int MAX_LOGIN_LENGTH = 20;

    private static final int MIN_PASSWORD_LENGTH = 6;
    private static final int MAX_PASSWORD_LENGTH = 25;
    private String login;
    private String password;
    private String confirmPassword;

//    public User(String login, String password, String confirmPassword) {
//        validationLogin(login);
//        lengthValidationPassword(password);
//        validationPassword(password);
//        equalsValidationPassword(password, confirmPassword);
//
//        this.login = login;
//        this.password = password;
//        this.confirmPassword = confirmPassword;
//    }

    public User(String login) {
        validationLogin(login);
        this.login = login;
    }

    public User(String password, String confirmPassword) {
        lengthValidationPassword(password);
        equalsValidationPassword(password, confirmPassword);
        validationLogin(password);
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    private void validationLogin(String login) {
        if (login.length() > MAX_LOGIN_LENGTH || !login.matches("^[a-zA-Z]+$")) {
            throw new WrongLoginException("Login should be up to 20 characters and contain only English letters.");
        }
    }

    private void lengthValidationPassword(String password) {
        if (MIN_PASSWORD_LENGTH > password.length() || password.length() > MAX_PASSWORD_LENGTH) {
            throw new WrongLengthPasswordException("The length of the password must be between 6 and 25 characters.");
        }
    }

    private void validationPassword(String password) {
        if (!password.matches("^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z\\d]+$")) {
            throw new WrongPasswordException("The password must contain at least one letter, one number.");
        }
    }

    private void equalsValidationPassword(String password, String confirmPassword) {
        if (!password.equals(confirmPassword) || password == null) {
            throw new WrongEqualsPasswordException("Password must match");
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }


    public String getConfirmPassword() {
        return confirmPassword;
    }
}
