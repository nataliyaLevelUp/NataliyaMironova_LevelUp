package lesson.unit.tests;

import lesson.unit.tests.dataProvider.SqrtDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSqrt extends AbstractBaseTest {

    @Test(dataProviderClass = SqrtDataProvider.class, dataProvider = "Sqrt Positive Double Data Provider")
    public void testSqrtPositiveDouble(double a, double expected) {
        System.out.println("Test testSqrtPositiveDouble: Квадратный корень из"+ a + "=" + expected);
        Assert.assertEquals(calculator.sqrt(a),expected);
    }

    @Test(dataProviderClass = SqrtDataProvider.class, dataProvider = "Sqrt Negative Double Data Provider")
    public void testSqrtNegativeDouble(double a, double expected) {
        System.out.println("Test testSqrtPositiveDouble: Квадратный корень из"+ a + "=" + expected);
        Assert.assertNotEquals(calculator.sqrt(a),expected);
    }
}
