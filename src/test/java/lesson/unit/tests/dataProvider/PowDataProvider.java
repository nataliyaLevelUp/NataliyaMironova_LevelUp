package lesson.unit.tests.dataProvider;

import lesson.unit.tests.AbstractBaseTest;
import org.testng.annotations.DataProvider;

public class PowDataProvider extends AbstractBaseTest {

    @DataProvider(name = "Pow Positive Double Data Provider")
    public Object [][] powPositiveDoubleDataProvider() {
        return new Object[][] {
                {5.5,2.2,30.25},
                {1.2,2.2,1.44},
                {4.4,2.2,26.04},
                {5.5, 0, 1}
        };
    }

    @DataProvider(name = "Pow Negative Double Data Provider")
    public Object [][] powNegativeDoubleDataProvider() {
        return new Object[][] {
                {5.5,0,0},
                {1.2,2.2,2},
                {4.4,2.2,19.360000000000003}
        };
    }

}
