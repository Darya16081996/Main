import org.openqa.selenium.By;

public class AuthPage extends BasePage {
    String pageURL = "https://opensource-demo.orangehrmlive.com/";

    private static final By USERNAME_LOCATOR = By.id("txtUsername");
    private static final By PASSWORD_LOCATOR = By.id("txtPassword");
    private static final By SIGN_IN_BUTTON_LOCATOR = By.id("btnLogin");
    private static final By ERROR_MESSAGE = By.id("spanMessage");


    public AuthPage insertLogin(String login) {
        type(USERNAME_LOCATOR, login);
        return this;}

        public AuthPage insertPassword(String password) {
            type(PASSWORD_LOCATOR, password);
            return this;
        }

        public void clickSignInButton() {
            click(SIGN_IN_BUTTON_LOCATOR);
        }

        public String getErrorMessage() {
            return getElementText(ERROR_MESSAGE);
        }

        public MainPage fullAuth(String login, String password) {
            insertLogin(login);
            insertPassword(password);
            clickSignInButton();

            return new MainPage();
        }

        public void openAuthPage() {
            openUrl(pageURL);
        }
    }

