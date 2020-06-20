package homework5;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MailPage {

    public WebDriver driver;


    public MailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mailbox:login")
    public WebElement user;

    @FindBy(xpath = "//*[@id='mailbox:submit']/input")
    public WebElement buttonForPassword;

    @FindBy(id = "mailbox:password")
    public WebElement password;

    @FindBy(xpath = "//*[@id='mailbox:submit']")
    public WebElement buttonSubmit;

    public  MailPage login(String name, String password) {
        user.sendKeys(name);
        buttonForPassword.click();
        this.password.sendKeys(password);
        buttonSubmit.click();
        return this;
    }

    public String expectedTitle = driver.getTitle();

    public  MailPage expectedTitle(String str) {
        expectedTitle = driver.getTitle();
        return this;
    }

    @FindBy(linkText = "Написать письмо")
    public WebElement writeLetter;

    @FindBy(xpath = "html/body/div[15]/div[2]/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div/div[2]/div/div/label/div/div/input")
    public WebElement address;

    @FindBy(xpath = "/html/body/div[15]/div[2]/div/div[1]/div[2]/div[3]/div[3]/div[1]/div[2]/div/input")
    public WebElement theme;

    @FindBy(xpath = "/html/body/div[15]/div[2]/div/div[1]/div[2]/div[3]/div[5]/div/div/div[2]/div[1]/div[1]")
    public WebElement body;

    @FindBy(xpath = "/html/body/div[15]/div[2]/div/div[2]/div[1]/span[2]/span/span")
    public WebElement saveLetter;

    @FindBy(xpath = "//button[@title='Закрыть']")
    public WebElement closeLetter;

    public MailPage createAndSaveLetter(String emailAddress, String themeLetter, String bodyLetter) {
        writeLetter.click();
        address.sendKeys(emailAddress);
        theme.sendKeys(themeLetter);
        body.sendKeys(bodyLetter);
        saveLetter.click();
        closeLetter.click();
        return this;
    }

    // Отправка письма из черновика

    @FindBy(linkText = "Черновики")
    public WebElement drafts;

    @FindBy(xpath = "//*[text()='n6937@yandex.ru']")
    public WebElement beforeCreatedLetter;

    @FindBy(xpath = "//*[text()='Тема письма']")
    public WebElement assertTitle;

    public String asserttitle = assertTitle.getText();

    @FindBy(xpath = "/*[text()='Тело письма']")
    public WebElement assertBody;

    @FindBy(xpath = "//*[text()='Отправить']")
    public WebElement sendLetter;

    @FindBy(xpath = "/*[text()='Отправленные']")
    public WebElement lettersWasSentFolder;

    public MailPage checkLetterInDrafts(String themeOfLetter, String bodyOfLetter) {
        drafts.click();
        beforeCreatedLetter.click();
        assertEquals(assertTitle, themeOfLetter);
        assertEquals(assertBody, bodyOfLetter);
        sendLetter.click();
        lettersWasSentFolder.click();
        return this;
    }

    @FindBy(id = "PH_logoutLink")
    public WebElement logout;

    public MailPage logout() {
        logout.click();
        return this;
    }

}
