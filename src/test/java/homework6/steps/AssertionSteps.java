package homework6.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.hamcrest.MatcherAssert.assertThat;

public class AssertionSteps extends BaseSteps {

    public AssertionSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Assert login")
    public void assertLogin() {
        assertThat(mailPage.expectedTitle, equals(wait.until(ExpectedConditions.titleIs("Входящие - Почта Mail.ru"))));
    }

    @Step("Verify, that created letter contains correct address, body, theme")
    public void assertElementsOfLetter() {
        mailPage.compareElementsOfLetter("Тема письма", "Тело письма");
    }
}
