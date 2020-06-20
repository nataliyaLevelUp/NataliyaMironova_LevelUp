package homework_3.dataProvider;

import homework_3.AbstractBaseTest;
import org.testng.annotations.DataProvider;

public class SumDataProvider extends AbstractBaseTest {

    @DataProvider(name = "Sum Positive Long Data Provider")
    public Object [][] sumPositiveLongDataProvider() {
        return new Object[][] {
                {1,1,2},
                {2,2,4},
                {4,4,8},
                {5,5,10}
        };
    }

    @DataProvider(name = "Sum Negative Long Data Provider")
    public Object [][] sumNegativeLongDataProvider() {
        return new Object[][] {
                {1,1,3},
                {2,2,5},
                {4,4,7},
                {5,5,9}
        };
    }

    @DataProvider(name = "Sum Positive Double Data Provider")
    public Object [][] sumPositiveDoubleDataProvider() {
        return new Object[][] {
                {1.0,1.0,2.0},
                {2.0,2.0,4.0},
                {4.0,4.0,8.0},
                {5.0,5.0,10.0}
        };
    }

    @DataProvider(name = "Sum Negative Double Data Provider")
    public Object [][] sumNegativeDoubleDataProvider() {
        return new Object[][] {
                {1.0,1.0,3.0},
                {2.0,2.0,5.0},
                {4.0,4.0,7.0},
                {5.0,5.0,9.0}
        };
    }

}
