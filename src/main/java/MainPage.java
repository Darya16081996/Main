import org.openqa.selenium.By;


public class MainPage extends BasePage {


    private static final By USERNAME_lOCATOR = By.id("welcome");
//    private static final By PASSWORD_lOCATOR = By.id("txtPassword");
//    private static final By SIGN_IN_BUTTON_lOCATOR = By.id("btnLogin");
//    private static final By ERROR_MESSAGE = By.id("spanMessage");
    private static final By TIMESHEET_BUTTON = By.xpath("//span[contains(text(), 'Timesheets')]");
    private static final By TIMESHEETT_BUTTON = By.id("employee");
    private static final By HEADER_BUTTON = By.xpath("//svg[@class='svg-inline--fa fa-question-circle fa-w-16 help-icon']");

    public String getUserName() {
        return getElementText(USERNAME_lOCATOR);
    }

    public TimeSheetPage getTimeSheet() {
        click(TIMESHEET_BUTTON);
        return new TimeSheetPage();
    }
    public TimeSheetPage getTimeSheett() {
        click(TIMESHEETT_BUTTON);
        return new TimeSheetPage();
    }

    public HeaderPage getHeader() {
        click(HEADER_BUTTON);
        return new HeaderPage();
    }


}
