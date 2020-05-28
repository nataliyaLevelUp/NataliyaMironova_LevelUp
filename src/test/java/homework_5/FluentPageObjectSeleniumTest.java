package homework_5;

import homework5.MailPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class FluentPageObjectSeleniumTest extends AbstractSeleniumBaseTest {

    WebDriver driver;

    @Test
    public void mailSuccessTest() {
        driver.get("https://mail.ru/");
        MailPage mailPage = new MailPage(driver);
        mailPage.login("level.up.2020", "MeaORPfit(33");
        assertThat(mailPage.expectedTitle, equals(wait.until(ExpectedConditions.titleIs("Входящие - Почта Mail.ru"))));
        mailPage.createAndSaveLetter("n6937@yandex.ru", "Тема письма", "Тело письма");
        mailPage.checkLetterInDrafts("Тема письма", "Тело письма");
        mailPage.logout();
    }
}
