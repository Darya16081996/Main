import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {
    private static WebDriver driver;

    private Driver(){
    }

    public static WebDriver getDriver() {
        if (driver == null){
//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
//            driver = new ChromeDriver();
            System.setProperty("driver", "chrome");
            String drvr = System.getProperty("driver");
            switch (drvr){
                case "firefox":
                    initFF();
                    break;
                case "chrome":
//                    initChrome();
//                    break;
                default:
                    initChrome();
        }
        }
        return driver;
    }

    private static void initFF(){

    }
    private static void initChrome(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
//        options.addArguments("--headless");
        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void tearDown() {
        driver.quit();
        driver = null;
    }
}
