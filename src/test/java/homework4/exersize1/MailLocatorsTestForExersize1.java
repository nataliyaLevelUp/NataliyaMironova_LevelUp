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

    @Test
    public void mailTest() throws InterruptedException {
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
        driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div/div[2]/div/div/label/div/div/input")).sendKeys("n6937@yandex.ru");
        driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div[1]/div[2]/div[3]/div[3]/div[1]/div[2]/div/input")).sendKeys("Тема письма");
        driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div[1]/div[2]/div[3]/div[5]/div/div/div[2]/div[1]/div[1]")).sendKeys("Тело письма");
        driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div[2]/div[1]/span[2]/span/span")).click();
        driver.findElement(By.xpath("//button[@title='Закрыть']")).click();
        driver.findElement(By.linkText("Черновики")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='n6937@yandex.ru']")));
        driver.findElement(By.xpath("//*[text()='n6937@yandex.ru']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Тема письма']")));
        String assertTitle = driver.findElement(By.xpath("//*[text()='Тема письма']")).getText();
        String assertBody = driver.findElement(By.xpath("//*[text()='Тело письма']")).getText();
        assertEquals(assertTitle, "Тема письма");
        assertEquals(assertBody, "Тело письма");
        driver.findElement(By.xpath("//*[text()='Отправить']")).click();
        WebDriverWait waitForTwo = new WebDriverWait(driver, 30);
        driver.findElement(By.xpath("//*[text()='Отправленные']")).click();
        driver.findElement(By.id("PH_logoutLink")).click();
    }
}
