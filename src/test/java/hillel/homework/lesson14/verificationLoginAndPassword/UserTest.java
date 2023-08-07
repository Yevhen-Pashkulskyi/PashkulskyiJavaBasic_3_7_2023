package hillel.homework.lesson14.verificationLoginAndPassword;

import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongLoginException;
import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongPasswordException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {
    private static final String VALID_PASSWORD = "password123";
    private static final String VALID_CONFIG_PASSWORD = VALID_PASSWORD;
    private static final String VALID_LOGIN = "userName";

    @Test
    public void testValidLogin() {
        User user = new User(VALID_LOGIN, VALID_PASSWORD, VALID_CONFIG_PASSWORD);
    }

    @Test
    public void testLongLogin() {
        String tested = "thisLoginIsVeryLongAndShouldNotBeaLowed";

        assertThrows(WrongLoginException.class, () -> {
            User user = new User(tested, VALID_PASSWORD, VALID_CONFIG_PASSWORD);
        });
    }

    @Test
    public void testNullLogin() {
        String tested = null;

        assertThrows(WrongLoginException.class, () -> {
            User user = new User(tested, VALID_PASSWORD, VALID_CONFIG_PASSWORD);
        });
    }

    @Test
    public void testEmptyLogin() {
        String tested = "";

        assertThrows(WrongLoginException.class, () -> {
            User user = new User(tested, VALID_PASSWORD, VALID_CONFIG_PASSWORD);
        });
    }

    @Test
    public void testDigitalLogin() {
        String tested = "username123";

        assertThrows(WrongLoginException.class, () -> {
            User user = new User(tested, VALID_PASSWORD, VALID_CONFIG_PASSWORD);
        });
    }

    @Test
    public void testSymbolLogin() {
        String tested = "user$!?name";

        assertThrows(WrongLoginException.class, () -> {
            User user = new User(tested, VALID_PASSWORD, VALID_CONFIG_PASSWORD);
        });
    }


    @Test
    public void testValidPassword() {
        User user = new User(VALID_LOGIN, VALID_PASSWORD, VALID_CONFIG_PASSWORD);
    }

    @Test
    public void testShortPassword() {
        String tested = "short";

        assertThrows(WrongPasswordException.class, () -> {
            User user = new User(VALID_LOGIN, tested, tested);
        });
    }

    @Test
    public void testLongPassword() {
        String tested = "veryLongPassword123456";

        /*WrongPasswordException message =*/
        assertThrows(WrongPasswordException.class, () -> {
            User user = new User(VALID_LOGIN, tested, tested);
        });
//        assertEquals("The length of the password must be between 6 and 25 characters.", message.getMessage());
    }

    @Test
    public void testNoLetterPassword() {
        String tested = "123456789";

        assertThrows(WrongPasswordException.class, () -> {
            User user = new User(VALID_LOGIN, tested, tested);
        });
    }

    @Test
    public void testNoDigitPassword() {
        String tested = "password";

        assertThrows(WrongPasswordException.class, () -> {
            User user = new User(VALID_LOGIN, tested, tested);
        });
    }

    @Test
    public void testEqualsPasswords() {
        String tested = "password123";

        User user = new User(VALID_LOGIN, tested, tested);
        // No exception should be thrown
    }

    @Test
    public void testNotEqualsPasswords() {
        String password = "password123";
        String notEquals = "notEquals123";

        assertThrows(WrongPasswordException.class, () -> {
            User user = new User(VALID_LOGIN, password, notEquals);
        });
    }

    @Test
    public void testNullPasswords() {
        String tested = null;

        Assertions.assertThrows(WrongPasswordException.class, () -> {
            User user = new User(VALID_LOGIN, tested, tested);
        });
    }

    @Test
    public void testEmptyPasswords() {
        String tested = "";

        assertThrows(WrongPasswordException.class, () -> {
            User user = new User(VALID_LOGIN, tested, tested);
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

}


