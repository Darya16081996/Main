import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthPage {
    private WebDriver driver;

    private static final By USERNAME_lOCATOR = By.id("txtUsername");
    private static final By PASSWORD_lOCATOR = By.id("txtPassword");
    private static final By SIGN_IN_BUTTON_lOCATOR = By.id("btnLogin");
    private static final By ERROR_MESSAGE = By.id("spanMessage");

    public AuthPage(WebDriver driver) {
        this.driver = driver;
    }

    public void insertLogin(String login) {
        driver.findElement(USERNAME_lOCATOR).sendKeys(login);
    }
    public void insertPassword(String password) {
        driver.findElement(PASSWORD_lOCATOR).sendKeys(password);
    }
    public void clickSignInButton() {
        driver.findElement(SIGN_IN_BUTTON_lOCATOR).click();
    }
    public String getErrorMessage() {
        return driver.findElement(ERROR_MESSAGE).getText();
    }

    public void fullAuth(String login, String password) {
        insertLogin(login);
        insertPassword(password);
        clickSignInButton();
    }
}