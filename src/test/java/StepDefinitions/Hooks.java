package StepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class Hooks {
    public static WebDriver driver;

    @Before
    public static void OpenBrowser() {
        // 1- Bridge
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);

        // 2- create object from chrome browser
        driver = new ChromeDriver();

        //3- Configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 4- navigate to url
        driver.navigate().to("https://demo.nopcommerce.com/");
//        driver.get();
    }

        @After
        public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}