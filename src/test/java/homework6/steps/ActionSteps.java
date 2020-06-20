package homework6.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ActionSteps extends BaseSteps {

    public ActionSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Login")
    public void login() {
        mailPage.login(LOGIN, PASSWORD);
    }

    @Step("Create letter")
    public void createLetter() {
        mailPage.createLetter(ADDRESS, THEME, BODY);
    }

    @Step("Save letter in Drufts folder")
    public void saveLetter() {
        mailPage.saveLetterClick();
    }

    @Step("Logout")
    public void logout() {
        mailPage.logout();
    }
}
