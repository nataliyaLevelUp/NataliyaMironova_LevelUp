package homework6.tests;

import homework6.steps.ActionSteps;
import homework6.steps.AssertionSteps;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {

    protected static WebDriver driver;
    protected ActionSteps actionSteps;
    protected AssertionSteps assertionSteps;

    protected static final String BASE_URL = "https://mail.ru/";
    protected static final String LOGIN = "level.up.2020";
    protected static final String PASSWORD = "MeaORPfit(33";


    @Step("Open: " + BASE_URL)
    @BeforeTest

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(BASE_URL);
        actionSteps = new ActionSteps(driver);
        assertionSteps = new AssertionSteps(driver);
    }

    @AfterTest
    static void tearDown() {
        driver.close();
    }
}
