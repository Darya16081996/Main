import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HeaderTest {
    AuthPage authPage;
    MainPage mainPage;
    HeaderPage headerPage;

    @BeforeEach
    public void setup() {
        authPage = new AuthPage();
        authPage.openAuthPage();
        mainPage = authPage.fullAuth("Admin", "admin123");
    }
    @Test
    public void getHeader() {
        headerPage = mainPage.getHeader();
    }
}
