package homework4.exersize2;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class MailLocatorsTestForExersize2 extends BaseTest {

    @Test
    public void mailTestExersize2() throws InterruptedException {

        driver.findElement(By.id("mailbox:login")).sendKeys("level.up.2020");
        driver.findElement(By.xpath("//*[@id=\"mailbox:submit\"]/input")).click();
        driver.findElement(By.id("mailbox:password")).sendKeys("MeaORPfit(33");
        driver.findElement(By.xpath("//*[@id=\"mailbox:submit\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.titleIs("Входящие - Почта Mail.ru"));
        assertEquals(driver.getTitle(), "Входящие - Почта Mail.ru");
        driver.findElement(By.linkText("Написать письмо")).click();
        WebDriverWait waitForOne = new WebDriverWait(driver, 10);
        waitForOne.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[15]/div[2]/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div/div[2]/div/div/label/div/div/input")));
        driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div/div[2]/div/div/label/div/div/input")).sendKeys("level.up.2020@mail.ru");
        driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div[1]/div[2]/div[3]/div[3]/div[1]/div[2]/div/input")).sendKeys("Тема тест");
        driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div[1]/div[2]/div[3]/div[5]/div/div/div[2]/div[1]/div[1]")).sendKeys("Тело");
        driver.findElement(By.xpath("//*[text()='Отправить']")).click();
        Thread.sleep(25000);
        driver.findElement(By.xpath("//*[text()='Тест']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Level Up']")));
        driver.findElement(By.xpath("//*[text()='Level Up']")).click();
        waitForOne.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Тема тест']")));
        String assertTitle = driver.findElement(By.xpath("//*[text()='Тема тест']")).getText();
        String assertBody = driver.findElement(By.xpath("//*[text()='Тело']")).getText();
        assertEquals(assertTitle, "Тема тест");
        assertEquals(assertBody, "Тело");
        driver.findElement(By.id("PH_logoutLink")).click();
    }
}
