package homework4.exersize3;

import homework4.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MailLocatorsTestForExersize3 extends BaseTest {


    @Test
    public void MailLocatorsTestForExersize3() throws InterruptedException {

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

        // Создание и отправка нового письма

        driver.findElement(By.cssSelector("[title = 'Написать письмо']")).click();
        mailAddress = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-type='to'] input")));
        mailAddress.sendKeys(MAIL_ADDRESS);
        mailTheme = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='Subject']")));
        mailTheme.sendKeys(MAIL_THEME);
        mailBody = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[role='textbox'")));
        mailBody.sendKeys(MAIL_BODY);

        sendButtonLetter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Отправить']")));
        sendButtonLetter.click();

        closeLetter = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@title='Закрыть']"))));
        closeLetter.click();

        // Переход в папку Входящие и проверка отправленного письма

        inboxFolder = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Входящие']")));
        inboxFolder.click();

        letterWasSentBefore = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@title='Level Up <level.up.2020@mail.ru>']")));
        letterWasSentBefore.click();

        assertTitle = driver.findElement(By.xpath("//*[text()='Тема письма']")).getText();
        assertBody = driver.findElement(By.xpath("//*[text()='Тело письма']")).getText();
        assertEquals(assertTitle, "Тема письма");
        assertEquals(assertBody, "Тело письма");

        // Отправка письма в корзину
        basket = wait.until(ExpectedConditions.elementToBeClickable(By.className("button2__txt")));
        basket.click();

        Thread.sleep(5000);

        // Проверка письма в корзине

        basketFolder = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Корзина']")));
        basketFolder.click();

        // logout
        logout = wait.until(ExpectedConditions.elementToBeClickable(By.id("PH_logoutLink")));
        logout.click();
    }

}
