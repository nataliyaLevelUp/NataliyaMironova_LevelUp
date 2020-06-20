package homework6.steps;


import homework6.pages.MailPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseSteps {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected MailPage mailPage;

    protected static final String LOGIN = "level.up.2020";
    protected static final String PASSWORD = "MeaORPfit(33";
    protected static final String ADDRESS = "n6937@yandex.ru";
    protected static final String THEME = "Тема письма";
    protected static final String BODY = "Тело письма";

    public BaseSteps(WebDriver driver) {
        this.driver = driver;
        mailPage = new MailPage(driver);
    }
}
