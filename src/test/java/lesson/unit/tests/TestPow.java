package lesson.unit.tests;

import lesson.unit.tests.dataProvider.PowDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPow extends AbstractBaseTest {

    @Test(dataProviderClass = PowDataProvider.class, dataProvider = "Pow Positive Double Data Provider")
    public void testPowPositiveDouble(double a, double b, double expected) {
        System.out.println("Test testPowPositiveDouble: "+ a + "в степени" + b + "=" + expected);
        Assert.assertEquals(calculator.pow(a,b),expected);
    }

    @Test(dataProviderClass = PowDataProvider.class, dataProvider = "Pow Negative Double Data Provider")
    public void testPowNegativeDouble(double a, double b, double expected) {
        System.out.println("Test testPowNegativeDouble: "+ a + "в степени" + b + "=" + expected);
        Assert.assertNotEquals(calculator.pow(a,b),expected);
    }

}
