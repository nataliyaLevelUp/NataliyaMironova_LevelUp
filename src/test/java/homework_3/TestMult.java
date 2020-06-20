package homework_3;

import homework_3.dataProvider.MultDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestMult extends AbstractBaseTest {

    @Test(dataProviderClass = MultDataProvider.class, dataProvider = "Mult Positive Long Data Provider")
    public void testMultPositiveLong(long a, long b, long expected) {
        System.out.println("Test testMultPositiveLong: "+ a + "*" + b + "=" + expected );
        assertEquals(calculator.mult(a,b),expected);
    }

    @Test(dataProviderClass = MultDataProvider.class, dataProvider = "Mult Negative Long Data Provider")
    public void testMultNegativeLong(long a, long b, long expected) {
        System.out.println("Test testMultNegativeLong: "+ a + "*" + b + "=" + expected );
        Assert.assertNotEquals(calculator.mult(a,b),expected);
    }

    @Test(dataProviderClass = MultDataProvider.class, dataProvider = "Mult Positive Double Data Provider")
    public void testMultPositiveDouble(double a, double b, double expected) {
        System.out.println("Test testMultPositiveDouble: "+ a + "*" + b + "=" + expected );
        assertEquals(calculator.mult(a,b), expected);
    }

    @Test(dataProviderClass = MultDataProvider.class, dataProvider = "Mult Negative Double Data Provider")
    public void testMultNegativeDouble(double a, double b, double expected) {
        System.out.println("Test testMultNegativeDouble: "+ a + "*" + b + "=" + expected );
        Assert.assertNotEquals(calculator.mult(a,b), expected);
    }
}
