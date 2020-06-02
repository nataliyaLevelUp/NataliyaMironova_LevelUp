package homework4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    public WebDriver driver;
    public WebDriverWait wait;

    public WebElement submitButton;
    public WebElement logout;
    public WebElement login;
    public WebElement passwordButton;
    public WebElement password;
    public WebElement mailAddress;
    public WebElement mailTheme;
    public WebElement mailBody;
    public WebElement saveLetter;
    public WebElement sendButtonLetter;
    public WebElement closeLetter;
    public WebElement draftsFolder;
    public WebElement draftLetter;
    public WebElement sendLetterFolder;
    public WebElement testFolder;
    public WebElement testLetter;
    public WebElement inboxFolder;
    public WebElement letterWasSentBefore;
    public WebElement basketFolder;
    public WebElement basket;


    public String assertTitle;
    public String assertBody;

    public String URL = "https://mail.ru/";
    public String LOGIN = "level.up.2020";
    public String PASSWORD = "MeaORPfit(33";
    public String PERSONAL_ADDRESS = "n6937@yandex.ru";
    public String MAIL_ADDRESS = "level.up.2020@mail.ru";
    public String MAIL_THEME = "Тема письма";
    public String MAIL_THEME_TEST = "Тема тест";
    public String MAIL_BODY = "Тело письма";


    @BeforeClass
    public void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}