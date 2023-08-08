package hillel.homework.lesson14.verificationLoginAndPassword;

import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongLoginException;
import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongPasswordException;

public class User {
    private static final int MAX_LOGIN_LENGTH = 20;
    private static final int MIN_PASSWORD_LENGTH = 6;
    private static final int MAX_PASSWORD_LENGTH = 25;
    private static final String REGEX_CONDITION_LOGIN = "^[a-zA-Z]+$";
    private static final String REGEX_CONDITION_PASSWORD = "^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z\\d]+$";

    private String login;
    private String password;

    public User(String login, String password, String confirmPassword) {
        validateLogin(login);
        validationPassword(password, confirmPassword);

        this.login = login;
        this.password = password;
    }

    private void validateLogin(String login) {
        if (emptyAndNull(login)) {
            throw new WrongLoginException("Login cannot be null or empty");
        } else if (login.length() > MAX_LOGIN_LENGTH) {
            throw new WrongLoginException(String.format("Login should be up to %d characters, and only English letters. ", MAX_LOGIN_LENGTH));
        } else if (!login.matches(REGEX_CONDITION_LOGIN)) {
            throw new WrongLoginException("Only English letters. ");
        }
    }

    private void validationPassword(String password, String confirmPassword) {
        if (emptyAndNull(password)) {
            throw new WrongPasswordException("Password cannot be null or empty. ");
        } else if (!password.matches(REGEX_CONDITION_PASSWORD)) {
            throw new WrongPasswordException("The password must contain at least one letter, one number and not have symbol. ");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password must match");
        } else if (MIN_PASSWORD_LENGTH > password.length() || password.length() > MAX_PASSWORD_LENGTH) { /*(!password.matches("^.{6,25}$")) { */
            throw new WrongPasswordException(String.format("The length of the password must be between %d and %d characters.", MIN_PASSWORD_LENGTH, MAX_PASSWORD_LENGTH));
        }
    }

    public boolean emptyAndNull(String str) {
        return (str == null || str.equals(""));
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}