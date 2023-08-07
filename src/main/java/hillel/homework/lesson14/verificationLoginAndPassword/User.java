package hillel.homework.lesson14.verificationLoginAndPassword;

import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongLoginException;
import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongPasswordException;

public class User {
    private static final int MAX_LOGIN_LENGTH = 20;
    private static final int MIN_PASSWORD_LENGTH = 6;
    private static final int MAX_PASSWORD_LENGTH = 25;
    private String login;
    private String password;
    private String confirmPassword;

    public User(String login, String password, String confirmPassword) {
        validateLogin(login);
        validationPassword(password, confirmPassword);

        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    protected User(String login) {
        validateLogin(login);
        this.login = login;
    }

    protected User(String password, String confirmPassword) {
        validationPassword(password, confirmPassword);
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    private void validateLogin(String login) {
        if (login.length() > MAX_LOGIN_LENGTH || !login.matches("^[a-zA-Z]+$")) {
            throw new WrongLoginException("Login should be up to 20 characters, and contain only English letters.");
        }
    }


    private void validationPassword(String password, String confirmPassword) {
        if /*(!password.matches("^.{6,20}$")) {*/ (MIN_PASSWORD_LENGTH > password.length() || password.length() > MAX_PASSWORD_LENGTH) {
            throw new WrongPasswordException("The length of the password must be between 6 and 25 characters.");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password must match");
        }

        char[] symbolPassword = password.toCharArray();
        boolean letter = false;
        boolean digit = false;

        for (int i = 0; i < symbolPassword.length; i++) {
            if (Character.isLetter(symbolPassword[i])) {
                letter = true;
            } else if (Character.isDigit(symbolPassword[i])) {
                digit = true;
            }
            if (letter && digit) {
                return;
            }
        }
        throw new WrongPasswordException("The password must contain at least one letter and one number.");

    }

    //    private void symbolValidationPassword(String password) {
//        if (!password.matches("^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z\\d]+$")) {
//            throw new WrongPasswordException("The password must contain at least one letter, one number.");
//        }
//    }


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
