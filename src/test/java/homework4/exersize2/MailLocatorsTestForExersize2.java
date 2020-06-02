package homework4.exersize2;

import homework4.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class MailLocatorsTestForExersize2 extends BaseTest {

    @Test
    public void mailTestExersize2()  {

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

        // Создание нового письма

        driver.findElement(By.cssSelector("[title = 'Написать письмо']")).click();
        mailAddress = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-type='to'] input")));
        mailAddress.sendKeys(MAIL_ADDRESS);
        mailTheme = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='Subject']")));
        mailTheme.sendKeys(MAIL_THEME_TEST);
        mailBody = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[role='textbox'")));
        mailBody.sendKeys(MAIL_BODY);

        sendButtonLetter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Отправить']")));
        sendButtonLetter.click();

        // закрываем окно письма

        closeLetter = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@title='Закрыть']"))));
        closeLetter.click();


        // Переход в папку Тест

        testFolder = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Тест']")));
        testFolder.click();

        // Проверка созданного письма в папке

        testLetter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Level Up']")));
        testLetter.click();

        assertTitle = driver.findElement(By.xpath("//*[text()='Тема тест']")).getText();
        assertBody = driver.findElement(By.xpath("//*[text()='Тело']")).getText();
        assertEquals(assertTitle, "Тема тест");
        assertEquals(assertBody, "Тело");

        // logout
        logout = wait.until(ExpectedConditions.elementToBeClickable(By.id("PH_logoutLink")));
        logout.click();
    }
}
