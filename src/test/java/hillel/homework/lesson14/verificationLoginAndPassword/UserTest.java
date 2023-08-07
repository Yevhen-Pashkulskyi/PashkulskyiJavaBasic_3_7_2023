package hillel.homework.lesson14.verificationLoginAndPassword;

import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongLoginException;
import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongPasswordException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {

    @Test
    public void testValidationLogin_ValidLogin() {
        User user = new User("username");
    }

    @Test
    public void testValidationLogin_LongLogin() {
        assertThrows(WrongLoginException.class, () -> {
            User user = new User("thisLoginIsVeryLongAndShouldNotBeaLowed");
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
    }

    @Test
    public void testLengthValidationPassword_ShortLengthPassword() {
        assertThrows(WrongPasswordException.class, () -> {
            User user = new User("short", "short");
        });
    }

    public void testLengthValidationPassword_LongLengthPassword() {
        assertThrows(WrongPasswordException.class, () -> {
            User user = new User("veryLongPassword123456789", "veryLongPassword123456789");
        });
    }

    @Test
    public void testValidationPassword_ValidPassword() {
        User user = new User("password123", "password123");
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
        assertThrows(WrongPasswordException.class, () -> {
            User user = new User("password123", "notmatching");
        });
    }


//
//    @Test
//    public void testValidationLogin_equalsValidLogin() {
//        User user = new User("validlogin");
//        assertEquals("validlogin", user.getLogin());
//    }
//
//    @Test
//    public void testValidationLogin_InvalidLogin_Length() {
//        assertThrows(WrongLoginException.class, () -> {
//            User user = new User("thisisaverylongloginthatexceedstwentycharacters");
//        });
//    }
//
//    @Test
//    public void testValidationLogin_InvalidLogin_Characters() {
//        assertThrows(WrongLoginException.class, () -> {
//            User user = new User("invalid$login");
//        });
//    }

}


