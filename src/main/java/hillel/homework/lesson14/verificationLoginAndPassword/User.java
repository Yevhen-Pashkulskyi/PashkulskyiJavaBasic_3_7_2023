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
        validationLogin(login);
        validationLengthPassword(password, confirmPassword);
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;

    }

    private void validationLogin(String login) {
        if (login.length() > MAX_LOGIN_LENGTH || !login.matches("^[a-zA-Z]+$")) {
            throw new WrongLoginException("Login should be up to 20 characters and contain only English letters.");
        }
    }

    private void validationLengthPassword(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password must match");
        }
        if (MIN_PASSWORD_LENGTH > password.length() || password.length() > MAX_PASSWORD_LENGTH || !password.matches("^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z\\d]+$")) {
            throw new WrongPasswordException("The password must contain at least one letter, one number and be 6-25 characters long.");
        }
//    } private void equalsValidationPassword(String password, String confirmPassword){
//        if(!password.equals(confirmPassword)){
//            throw new WrongPasswordException("Password must match");
//        }
//        if (MIN_PASSWORD_LENGTH > password.length() || password.length() > MAX_PASSWORD_LENGTH || !password.matches("^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z\\d]+$")){
//            throw new WrongPasswordException("The password must contain at least one letter, one number and be 6-25 characters long.");
//        }
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


    // TODO: 04.08.2023 Створити клас User з полями для зберігання логіну, паролю.
    // В конструкторі робити валідацію введених полів.
    // Написати тести для перевірки логіки.
    // Написати простий клас для демонстрації роботи програми (його тестувати не потрібно).
    // Зчитувати дані з консолі. Під час демонстрації відловлювати помилки.
    // Після 3 помилки вивести користувачу повідомлення і завершити роботу програми.
    // В будь-якому разі вивести повідомлення "Дякую, що скористались нашим сервісом".
    // Основне - продемонструвати вміння використовувати try-catch-finally конструкцію.
}
