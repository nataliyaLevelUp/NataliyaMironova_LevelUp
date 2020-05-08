package lesson.unit.tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

public abstract class AbstractBaseTest {

    protected Calculator calculator = new Calculator();

    @BeforeSuite
    public void setUpSuite() {
        System.out.println("Запускается сьют..");

    }

    @BeforeClass
    public void setUpClass() {
        System.out.println("Запускается класс...");
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("Запускается метод...");

    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("Метод запущен..");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("Класс запущен...");
    }

    @AfterSuite
    public void tearDownSuite() {
        System.out.println("Сьют запущен...");
    }
}
