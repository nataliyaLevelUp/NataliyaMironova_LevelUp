package lesson.unit.tests.dataProvider;

import lesson.unit.tests.AbstractBaseTest;
import org.testng.annotations.DataProvider;

public class MultDataProvider extends AbstractBaseTest {

    @DataProvider(name = "Mult Positive Long Data Provider")
    public Object [][] multPositiveLongDataProvider() {
        return new Object[][] {
                {2,1,2},
                {5,5,25},
                {4,3,12},
                {6,3,18}
        };
    }

    @DataProvider(name = "Mult Negative Long Data Provider")
    public Object [][] multNegativeLongDataProvider() {
        return new Object[][] {
                {2,1,3},
                {8,2,5},
                {9,3,5},
                {8,4,3}
        };
    }

    @DataProvider(name = "Mult Positive Double Data Provider")
    public Object [][] multPositiveDoubleDataProvider() {
        return new Object[][] {
                {2.0,1.0,2.00},
                {3.0,1.0,3.00},
                {4.0,3.0,12.00},
                {5.0,2.0,10.00}
        };
    }

    @DataProvider(name = "Mult Negative Double Data Provider")
    public Object [][] multNegativeDoubleDataProvider() {
        return new Object[][] {
                {1.0,1.0,2.0},
                {9.0,3.0,5.0},
                {5.0,4.0,1.0},
                {8.0,6.0,3.0}
        };
    }

}
