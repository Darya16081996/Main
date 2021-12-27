
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TimeSheetsTest {

    AuthPage authPage;
    MainPage mainPage;
    TimeSheetPage timeSheetPage;

    @BeforeEach
    public void setup() {
        authPage = new AuthPage();
        authPage.openAuthPage();
        mainPage = authPage.fullAuth("Admin", "admin123");
    }
    @Test
    public void getTimesheets() {
        timeSheetPage = mainPage.getTimeSheet();
    }

//    @Test
//    public void getTimesheet() {
//        timeSheetPage = mainPage.getTimeSheet();
//        WebElement timeSheetPage = (WebElement) mainPage.getTimeSheett();
//        timeSheetPage.insertLoginn("Jann Anii1");
//        authPage.clickSignInButton();
//    }
}
