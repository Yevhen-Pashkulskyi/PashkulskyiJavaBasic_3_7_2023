package hillel.homework.lesson14.verificationLoginAndPassword;


import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongEqualsPasswordException;
import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongLengthPasswordException;
import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongLoginException;
import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongPasswordException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {

    @Test
    public void testValidationLogin_ValidLogin() {
        User user = new User("username");
        // No exception should be thrown
    }

    @Test
    public void testValidationLogin_LongLogin() {
        assertThrows(WrongLoginException.class, () -> {
            User user = new User("thisloginisverylongandshouldnotbeallowed");
        });
    }

    @Test
    public void testValidationLogin_InvalidCharacters() {
        assertThrows(WrongLoginException.class, () -> {
            User user = new User("username123");
        });
    }

    @Test
    public void testLengthValidationPassword_ValidPassword() {
        User user = new User("password123", "password123");
        // No exception should be thrown
    }

    @Test
    public void testLengthValidationPassword_ShortPassword() {
        assertThrows(WrongLengthPasswordException.class, () -> {
            User user = new User("shortpwd", "shortpwd");
        });
    }

    @Test
    public void testValidationPassword_ValidPassword() {
        User user = new User("password123", "password123");
        // No exception should be thrown
    }

    @Test
    public void testValidationPassword_NoLetter() {
        assertThrows(WrongPasswordException.class, () -> {
            User user = new User("123456789", "123456789");
        });
    }

    @Test
    public void testValidationPassword_NoDigit() {
        assertThrows(WrongPasswordException.class, () -> {
            User user = new User("password", "password");
        });
    }

    @Test
    public void testEqualsValidationPassword_MatchingPasswords() {
        User user = new User("password123", "password123");
        // No exception should be thrown
    }

    @Test
    public void testEqualsValidationPassword_NotMatchingPasswords() {
        assertThrows(WrongEqualsPasswordException.class, () -> {
            User user = new User("password123", "notmatching");
        });
    }
}


