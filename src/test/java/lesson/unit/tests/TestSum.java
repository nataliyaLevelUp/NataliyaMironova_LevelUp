package lesson.unit.tests;

import lesson.unit.tests.dataProvider.SumDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSum extends AbstractBaseTest {

    @Test(dataProviderClass = SumDataProvider.class, dataProvider = "Sum Positive Long Data Provider")
    public void testSumPositiveLong(long a, long b, long expected) {
        System.out.println("Test testSumPositiveLong: "+ a + "+" + b + "=" + expected );
        Assert.assertEquals(calculator.sum(a,b),expected);
    }

    @Test(dataProviderClass = SumDataProvider.class, dataProvider = "Sum Negative Long Data Provider")
    public void testSumNegativeLong(long a, long b, long expected) {
        System.out.println("Test testSumNegativeLong: "+ a + "+" + b + "=" + expected );
        Assert.assertNotEquals(calculator.sum(a,b),expected);
    }

    @Test(dataProviderClass = SumDataProvider.class, dataProvider = "Sum Positive Long Data Provider")
    public void testSumPositiveDouble(double a, double b, double expected) {
        System.out.println("Test testSumPositiveDouble: "+ a + "+" + b + "=" + expected );
        Assert.assertEquals(calculator.sum(a,b),expected);
    }

    @Test(dataProviderClass = SumDataProvider.class, dataProvider = "Sum Negative Long Data Provider")
    public void testSumNegativeDouble(double a, double b, double expected) {
        System.out.println("Test testSumNegativeDouble: "+ a + "+" + b + "=" + expected );
        Assert.assertNotEquals(calculator.sum(a,b),expected);
    }


}
