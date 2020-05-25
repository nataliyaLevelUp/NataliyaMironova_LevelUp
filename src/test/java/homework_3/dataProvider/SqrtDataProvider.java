package homework_3.dataProvider;

import homework_3.AbstractBaseTest;
import org.testng.annotations.DataProvider;

public class SqrtDataProvider extends AbstractBaseTest {

    @DataProvider(name = "Sqrt Positive Double Data Provider")
    public Object [][] sqrtPositiveDoubleDataProvider() {
        return new Object[][] {
                {2.2,1.48},
                {1.2,1.09},
                {4.4,2.09}
        };
    }

    @DataProvider(name = "Sqrt Negative Double Data Provider")
    public Object [][] sqrtNegativeDoubleDataProvider() {
        return new Object[][] {
                {2.2,0},
                {1.2,0},
                {4.4,0}
        };
    }

}
