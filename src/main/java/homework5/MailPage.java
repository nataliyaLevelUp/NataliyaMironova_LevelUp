package homework5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MailPage extends BasePage {

    public MailPage(WebDriver driver) {
        super(driver);
    }

    public String expectedTitle;

    @FindBy(id = "mailbox:login")
    public WebElement user;

    @FindBy(css = "#mailbox [type='submit']")
    public WebElement buttonForPassword;

    @FindBy(id = "mailbox:password")
    public WebElement password;

    @FindBy(css = "#mailbox [type='submit']")
    public WebElement buttonSubmit;

    @FindBy(linkText = "Написать письмо")
    public WebElement writeLetter;

    @FindBy(css = "[data-type='to'] input")
    public WebElement address;

    @FindBy(css = "input[name='Subject']")
    public WebElement theme;

    @FindBy(css = "input[role='textbox'")
    public WebElement body;

    @FindBy(css = "[title='Сохранить']")
    public WebElement saveLetter;

    @FindBy(xpath = "//button[@title='Закрыть']")
    public WebElement closeLetter;

    @FindBy(linkText = "Черновики")
    public WebElement drafts;

    @FindBy(xpath = "//*[text()='n6937@yandex.ru']")
    public WebElement beforeCreatedLetter;

    @FindBy(xpath = "//*[text()='Тема письма']")
    public String assertTitle;


    @FindBy(xpath = "/*[text()='Тело письма']")
    public WebElement assertBody;

    @FindBy(xpath = "//*[text()='Отправить']")
    public WebElement sendLetter;

    @FindBy(xpath = "/*[text()='Отправленные']")
    public WebElement lettersWasSentFolder;

    @FindBy(id = "PH_logoutLink")
    public WebElement logout;


    public  MailPage login(String name, String password) {

        user.sendKeys(name);
        buttonForPassword.click();
        this.password.sendKeys(password);
        buttonSubmit.click();
        return this;
    }

    public  MailPage expectedTitle(String str) {
        wait.until(ExpectedConditions.titleIs("Входящие - Почта Mail.ru"));
        expectedTitle = driver.getTitle();
        assertEquals(expectedTitle, "Входящие - Почта Mail.ru");
        return this;
    }

    public MailPage createLetter(String emailAddress, String themeLetter, String bodyLetter) {

        wait.until(ExpectedConditions.elementToBeClickable(writeLetter));
        writeLetter.click();
        wait.until(ExpectedConditions.visibilityOf(address));
        address.sendKeys(emailAddress);
        wait.until(ExpectedConditions.visibilityOf(theme));
        theme.sendKeys(themeLetter);
        wait.until(ExpectedConditions.visibilityOf(body));
        body.sendKeys(bodyLetter);
        return this;
    }

    public void saveLetterClick() {
        saveLetter.click();
    }

    public MailPage createAndSaveLetter(String emailAddress, String themeLetter, String bodyLetter) {

        wait.until(ExpectedConditions.elementToBeClickable(writeLetter));
        writeLetter.click();
        wait.until(ExpectedConditions.visibilityOf(address));
        address.sendKeys(emailAddress);
        wait.until(ExpectedConditions.visibilityOf(theme));
        theme.sendKeys(themeLetter);
        wait.until(ExpectedConditions.visibilityOf(body));
        body.sendKeys(bodyLetter);
        wait.until(ExpectedConditions.elementToBeClickable(saveLetter));
        saveLetter.click();
        wait.until(ExpectedConditions.elementToBeClickable(closeLetter));
        closeLetter.click();
        return this;
    }

    public MailPage checkLetterInDrafts(String themeOfLetter, String bodyOfLetter) {

        wait.until(ExpectedConditions.elementToBeClickable(drafts));
        drafts.click();
        wait.until(ExpectedConditions.elementToBeClickable(beforeCreatedLetter));
        beforeCreatedLetter.click();
        assertEquals(assertTitle, themeOfLetter);
        assertEquals(assertBody, bodyOfLetter);
        wait.until(ExpectedConditions.elementToBeClickable(sendLetter));
        sendLetter.click();
        lettersWasSentFolder.click();
        return this;
    }

    public MailPage logout() {
        wait.until(ExpectedConditions.elementToBeClickable(logout));
        logout.click();
        return this;
    }

}
