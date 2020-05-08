package lesson.unit.tests.dataProvider;

import lesson.unit.tests.AbstractBaseTest;
import org.testng.annotations.DataProvider;

public class DivDataProvider extends AbstractBaseTest {

    @DataProvider(name = "Div Positive Long Data Provider")
    public Object [][] divPositiveLongDataProvider() {
        return new Object[][] {
                {2,1,2},
                {5,5,1},
                {4,2,2},
                {6,0,0}
        };
    }

    @DataProvider(name = "Div Negative Long Data Provider")
    public Object [][] divNegativeLongDataProvider() {
        return new Object[][] {
                {2,1,3},
                {8,2,5},
                {9,3,5},
                {8,4,3}
        };
    }

    @DataProvider(name = "Div Positive Double Data Provider")
    public Object [][] divPositiveDoubleDataProvider() {
        return new Object[][] {
                {2.0,1.0,2.0},
                {3.0,1.0,3.0},
                {4.0,2.0,2.0},
                {8.0,2.0,4.0}
        };
    }

    @DataProvider(name = "Div Negative Double Data Provider")
    public Object [][] divNegativeDoubleDataProvider() {
        return new Object[][] {
                {1.0,1.0,2.0},
                {9.0,3.0,5.0},
                {5.0,4.0,1.0},
                {8.0,6.0,3.0}
        };
    }

}
