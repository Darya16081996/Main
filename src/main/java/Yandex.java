import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Yandex {
    WebDriver driver;
//    Yandex yandex;

//    public Yandex(WebDriver driver) {
//        this.driver = driver;
//    }

    @BeforeEach
//    public void setup() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        driver = new ChromeDriver();
//
//        driver.get("https://mail.yandex.by/");
//    }
    public void setup() {
        driver = Driver.getDriver();
//        yandex = new Yandex(driver);
        driver.get("https://yandex.ru");
    }

    @org.junit.jupiter.api.Test
    public void SendTest() {
        WebElement button = driver.findElement(By.xpath("//div[@class='desk-notif-card__login-new-item-title']"));
        button.click();
//        driver.findElement(By.className("desk-notif-card_mail-title")).click();
//        int deletedButtonsQuantity = driver.findElements(By.className("desk-notif-card_mail-title")).size();
//        Assertions.assertEquals(deletedButtonsQuantity, 1, "123");

        WebElement login = driver.findElement(By.xpath("//input[@class='Textinput-Control']"));
        login.sendKeys("daryagalteeva");
        WebElement button1 = driver.findElement(By.xpath("//button[@class='Button2 Button2_size_l Button2_view_action Button2_width_max Button2_type_submit']"));
        button1.click();
        List<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        if (!tabs2.isEmpty()) {
            driver.switchTo().window(tabs2.get(1));
        }
//        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='passp-field-passwd']")));
        WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
//        @id='passp-field-passwd'  passp:sign-in
//        By password = By.xpath("//input[@name='passwd']");
        password.sendKeys("C773kjVVGb88938");
//        WebElement button2 = driver.findElement(By.xpath("//button[@class='Button2 Button2_size_l Button2_view_action Button2_width_max Button2_type_submit']"));
//        button2.click();
        WebElement button2 = driver.findElement(By.xpath("//button[@id='passp:sign-in']"));
        button2.click();
//        WebElement post = driver.findElement(By.xpath("//div[@class='desk-notif-card__mail-title']"));
//        WebElement post = driver.findElement(By.xpath("//div[@text='Почта']"));
//        post.click();
//        authPage.insertLogin("Admin");
//        authPage.insertPassword("admin123");
//        authPage.clickSignInButton();

//        WebElement userName = driver.findElement(By.id("welcome"));

//        Assertions.assertEquals("Welcome Prachika", userName.getText());
//    }

//    @org.junit.jupiter.api.Test
//    public void wrongPassword() {
//        WebElement login = driver.findElement(By.xpath("//input[@class='Textinput-Control']"));
//        login.sendKeys("daryagalteeva");
//        WebElement button1 = driver.findElement(By.xpath("//button[@class='Button2 Button2_size_l Button2_view_action Button2_width_max Button2_type_submit']"));
//        button1.click();
//        WebElement password = driver.findElement(By.xpath("//input[@class='Textinput-Control']"));
//        password.sendKeys("88938");
//        WebElement button2 = driver.findElement(By.xpath("//button[@class='Button2 Button2_size_l Button2_view_action Button2_width_max Button2_type_submit']"));
//        button2.click();
//
//        authPage.insertLogin("Admin");
//        authPage.insertPassword("admin123456");
//        authPage.clickSignInButton();
//        String warningText = driver.findElement(By.id("Invalid credentials")).getText();
//
//        Assertions.assertEquals("Invalid credentials", warningText);
//    }
//
//    @org.junit.jupiter.api.Test
//    public void emptyPassword() {
//        authPage.insertLogin("Admin");
//        authPage.clickSignInButton();
//
//        String warningText = authPage.getErrorMessage();
//        Assertions.assertEquals("Password can not be empty", warningText);
//    }
    }


}
