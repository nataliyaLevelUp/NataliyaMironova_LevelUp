package lesson.unit.tests.dataProvider;

import lesson.unit.tests.AbstractBaseTest;
import org.testng.annotations.DataProvider;

public class SubDataProvider extends AbstractBaseTest {

    @DataProvider(name = "Sub Positive Long Data Provider")
    public Object [][] subPositiveLongDataProvider() {
        return new Object[][] {
                {2,1,1},
                {5,2,3},
                {4,3,1},
                {6,3,3}
        };
    }

    @DataProvider(name = "Sub Negative Long Data Provider")
    public Object [][] subNegativeLongDataProvider() {
        return new Object[][] {
                {2,1,3},
                {8,2,5},
                {9,3,5},
                {8,4,3}
        };
    }

    @DataProvider(name = "Sub Positive Double Data Provider")
    public Object [][] subPositiveDoubleDataProvider() {
        return new Object[][] {
                {2.0,1.0,1.0},
                {2.0,1.0,1.0},
                {4.0,3.0,1.0},
                {5.0,2.0,3.0}
        };
    }

    @DataProvider(name = "Sub Negative Double Data Provider")
    public Object [][] sumNegativeDoubleDataProvider() {
        return new Object[][] {
                {1.0,1.0,2.0},
                {9.0,3.0,5.0},
                {5.0,4.0,1.0},
                {8.0,6.0,3.0}
        };
    }
}
