package homework_3;

import homework_3.dataProvider.TrigDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTrig extends AbstractBaseTest {

    @Test(dataProviderClass = TrigDataProvider.class, dataProvider = "Tg Positive Data Provider")
    public void testPositiveTg(double a, double expected) {
        System.out.println("Test testDivPositiveLong: "+ "Tg от" + a + "=" + expected);
        Assert.assertEquals(calculator.tg(a),expected);
    }

    @Test(dataProviderClass = TrigDataProvider.class, dataProvider = "Tg Negative Data Provider")
    public void testNegativeTg(double a, double expected) {
        System.out.println("Test testPositiveTg: "+ "Tg от" + a + "=" + expected);
        Assert.assertNotEquals(calculator.tg(a),expected);
    }

    @Test(dataProviderClass = TrigDataProvider.class, dataProvider = "Ctg Positive Data Provider")
    public void testPositiveCtg(double a, double expected) {
        System.out.println("Test testPositiveCTg: "+ "Ctg от" + a + "=" + expected);
        Assert.assertEquals(calculator.ctg(a),expected);
    }

    @Test(dataProviderClass = TrigDataProvider.class, dataProvider = "Ctg Negative Data Provider")
    public void testNegativeCtg(double a, double expected) {
        System.out.println("Test testNegativeCTg: "+ "Ctg от" + a + "=" + expected);
        Assert.assertNotEquals(calculator.ctg(a),expected);
    }

    @Test(dataProviderClass = TrigDataProvider.class, dataProvider = "Cos Positive Data Provider")
    public void testPositiveCos(double a, double expected) {
        System.out.println("Test testPositiveCos: "+ "Cos от" + a + "=" + expected);
        Assert.assertEquals(calculator.cos(a),expected);
    }

    @Test(dataProviderClass = TrigDataProvider.class, dataProvider = "Cos Negative Data Provider")
    public void testNegativeCos(double a, double expected) {
        System.out.println("Test testNegativeCos: "+ "Cos от" + a + "=" + expected);
        Assert.assertNotEquals(calculator.cos(a),expected);
    }

    @Test(dataProviderClass = TrigDataProvider.class, dataProvider = "Sin Positive Data Provider")
    public void testPositiveSin(double a, double expected) {
        System.out.println("Test testPositiveSin: "+ "Sin от" + a + "=" + expected);
        Assert.assertEquals(calculator.sin(a),expected);
    }

    @Test(dataProviderClass = TrigDataProvider.class, dataProvider = "Sin Negative Data Provider")
    public void testNegativeSin(double a, double expected) {
        System.out.println("Test testNegativeSin: "+ "Sin от" + a + "=" + expected);
        Assert.assertNotEquals(calculator.sin(a),expected);
    }
}
