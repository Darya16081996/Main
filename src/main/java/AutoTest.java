
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoTest extends BaseTest {
    AuthPage authPage;
    MainPage mainPage;

    @BeforeEach
    public void setup() {
        authPage = new AuthPage();
        authPage.openAuthPage();
    }

    @org.junit.jupiter.api.Test
    public void successAuth() {

        mainPage = authPage.fullAuth("Admin","admin123");

        String userName = mainPage.getUserName();
        assertEquals("Welcome Paul", userName);
    }

    @Test
    public void wrongPassword() {

        authPage.insertLogin("Admin");
        authPage.insertPassword("admin123456");
        authPage.clickSignInButton();
        String warningText = authPage.getErrorMessage();
        assertEquals("Invalid credentials", warningText);
    }

    @org.junit.jupiter.api.Test
    public void emptyPassword() {
        authPage.insertLogin("Admin");
        authPage.clickSignInButton();

        String warningText = authPage.getErrorMessage();
        assertEquals("Password can not be empty", warningText);
    }

    @org.junit.jupiter.api.Test
    public void emptyLogin() {
        authPage.insertPassword("admin123");
        authPage.clickSignInButton();

        String warningText = authPage.getErrorMessage();
        assertEquals("Username can not be empty", warningText);
    }
    @AfterEach
    public void tearDown() {
        Driver.tearDown();
    }
}