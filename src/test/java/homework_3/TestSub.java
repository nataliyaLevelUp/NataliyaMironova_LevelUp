package homework_3;

import homework_3.dataProvider.SubDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSub extends AbstractBaseTest {

    @Test(dataProviderClass = SubDataProvider.class, dataProvider = "Sub Positive Long Data Provider")
    public void testSubPositiveLong(long a, long b, long expected) {
        System.out.println("Test testSubPositiveLong: "+ a + "-" + b + "=" + expected);
        Assert.assertEquals(calculator.sub(a,b),expected);
    }

    @Test(dataProviderClass = SubDataProvider.class, dataProvider = "Sub Negative Long Data Provider")
    public void testSubNegativeLong(long a, long b, long expected) {
        System.out.println("Test testSubNegativeLong: "+ a + "-" + b + "=" + expected);
        Assert.assertNotEquals(calculator.sub(a,b),expected);
    }

    @Test(dataProviderClass = SubDataProvider.class, dataProvider = "Sub Positive Double Data Provider")
    public void testSubPositiveDouble(double a, double b, double expected) {
        System.out.println("Test testSubPositiveDouble: "+ a + "-" + b + "=" + expected);
        Assert.assertEquals(calculator.sub(a,b),expected);
    }

    @Test(dataProviderClass = SubDataProvider.class, dataProvider = "Sub Negative Double Data Provider")
    public void testSubNegativeDouble(double a, double b, double expected) {
        System.out.println("Test testSubNegativeDouble: "+ a + "-" + b + "=" + expected);
        Assert.assertNotEquals(calculator.sub(a,b),expected);
    }
}
