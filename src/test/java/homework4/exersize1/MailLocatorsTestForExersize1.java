package homework4.exersize1;

import homework4.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class MailLocatorsTestForExersize1 extends BaseTest {


    @Test
    public void mailTest()  {

        // логин в почтовый ящик

        login = wait.until(ExpectedConditions.elementToBeClickable(By.id("mailbox:login")));
        login.sendKeys(LOGIN);
        passwordButton = driver.findElement(By.id("mailbox:submit"));
        passwordButton.click();
        password = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mailbox [placeholder='Пароль']")));
        password.sendKeys(PASSWORD);
        submitButton = driver.findElement(By.cssSelector("#mailbox [type='submit']"));
        submitButton.click();

        wait.until(ExpectedConditions.titleIs("Входящие - Почта Mail.ru"));
        assertEquals(driver.getTitle(), "Входящие - Почта Mail.ru");

        // создание нового письма
        driver.findElement(By.cssSelector("[title = 'Написать письмо']")).click();

        mailAddress = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-type='to'] input")));
        mailAddress.sendKeys(PERSONAL_ADDRESS);
        mailTheme = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='Subject']")));
        mailTheme.sendKeys(MAIL_THEME);
        mailBody = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[role='textbox'")));
        mailBody.sendKeys(MAIL_BODY);


        // сохранение в черновиках
        saveLetter = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[title='Сохранить']")));
        saveLetter.click();

        // закрываем окно письма

        closeLetter = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='button'][title='Закрыть']")));
        closeLetter.click();

        // Переходим в папку черновики

        draftsFolder = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Черновики")));
        draftsFolder.click();

        // проверка сохранённого письма

        wait.until(ExpectedConditions.titleIs("Черновики - Почта Mail.ru"));

        draftLetter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='n6937@yandex.ru']")));
        draftLetter.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Тема письма']")));
        assertTitle = driver.findElement(By.xpath("//*[text()='Тема письма']")).getText();
        assertBody = driver.findElement(By.xpath("//*[text()='Тело письма']")).getText();
        assertEquals(assertTitle, "Тема письма");
        assertEquals(assertBody, "Тело письма");

        // отправка письма и переход в папку Отправленные

        sendButtonLetter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Отправить']")));
        sendButtonLetter.click();

        sendLetterFolder = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/*[text()='Отправленные']")));
        sendLetterFolder.click();

        logout = wait.until(ExpectedConditions.elementToBeClickable(By.id("PH_logoutLink")));
        logout.click();
    }
}
