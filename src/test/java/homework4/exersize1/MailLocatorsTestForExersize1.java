package homework4.exersize1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class MailLocatorsTestForExersize1 extends BaseTest  {

    WebElement mailAddress, mailTheme, mailBody, saveLetter, closeLetter, draftsFolder, draftLetter, sendLetterFolder;

    String assertTitle, assertBody;

    @Test
    public void mailTest()  {

        // логин в почтовый ящик
        driver.findElement(By.id("mailbox:login")).sendKeys("level.up.2020");
        driver.findElement(By.xpath("//*[@id=\"mailbox:submit\"]/input")).click();
        driver.findElement(By.id("mailbox:password")).sendKeys("MeaORPfit(33");
        driver.findElement(By.xpath("//*[@id=\"mailbox:submit\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.titleIs("Входящие - Почта Mail.ru"));
        assertEquals(driver.getTitle(), "Входящие - Почта Mail.ru");

        // создание нового письма
        driver.findElement(By.cssSelector("[title = 'Написать письмо']")).click();

        mailAddress = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-type='to'] input")));
        mailAddress.sendKeys("n6937@yandex.ru");
        mailTheme = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='Subject']")));
        mailTheme.sendKeys("Тема письма");
        mailBody = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[role='textbox'")));
        mailBody.sendKeys();


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
        driver.findElement(By.xpath("//*[text()='Отправить']")).click();

        sendLetterFolder = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/*[text()='Отправленные']")));
        sendLetterFolder.click();
        driver.findElement(By.id("PH_logoutLink")).click();
    }
}
