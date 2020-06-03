package homework_5;

import homework5.MailPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class AbstractSeleniumBaseTest {

    protected WebDriver driver;
    protected MailPage mailPage;
    WebDriverWait wait;
    public String URL = "https://mail.ru/";

    @BeforeClass
    public void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 20);
        driver.get(URL);
        mailPage = new MailPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
