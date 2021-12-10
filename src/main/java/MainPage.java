import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

      private static final By USERNAME_lOCATOR = By.id("txtUsername");
//    private static final By PASSWORD_lOCATOR = By.id("txtPassword");
//    private static final By SIGN_IN_BUTTON_lOCATOR = By.id("btnLogin");
//    private static final By ERROR_MESSAGE = By.id("spanMessage");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUserName() {
        return driver.findElement(USERNAME_lOCATOR).getText();
    }

    public void fullAuth(String login, String password) {
    }

}
