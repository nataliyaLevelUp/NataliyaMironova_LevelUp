package homework_3;

import homework_3.dataProvider.DivDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDiv extends AbstractBaseTest {

    @Test(dataProviderClass = DivDataProvider.class, dataProvider = "Div Positive Long Data Provider")
    public void testDivPositiveLong(long a, long b, long expected) {
        System.out.println("Test testDivPositiveLong: "+ a + "/" + b + "=" + expected);
        Assert.assertEquals(calculator.div(a,b),expected);
    }

    @Test(dataProviderClass = DivDataProvider.class, dataProvider = "Div Negative Long Data Provider")
    public void testDivNegativeLong(long a, long b, long expected) {
        System.out.println("Test testDivNegativeLong: "+ a + "/" + b + "=" + expected);
        Assert.assertNotEquals(calculator.div(a,b),expected);
    }

    @Test(dataProviderClass = DivDataProvider.class, dataProvider = "Div Positive Double Data Provider")
    public void testDivPositiveDouble(double a, double b, double expected) {
        System.out.println("Test testDivPositiveDouble: "+ a + "/" + b + "=" + expected);
        Assert.assertEquals(calculator.div(a,b),expected);
    }

    @Test(dataProviderClass = DivDataProvider.class, dataProvider = "Div Negative Double Data Provider")
    public void testDivNegativeDouble(double a, double b, double expected) {
        System.out.println("Test testDivNegativeDouble: "+ a + "/" + b + "=" + expected);
        Assert.assertNotEquals(calculator.div(a,b),expected);
    }
}
