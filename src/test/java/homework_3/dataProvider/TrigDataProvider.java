package homework_3.dataProvider;

import homework_3.AbstractBaseTest;
import org.testng.annotations.DataProvider;

public class TrigDataProvider extends AbstractBaseTest {

    @DataProvider(name = "Tg Positive Data Provider")
    public Object [][] tgPositiveDataProvider() {
        return new Object[][] {
                {60,1.0},
                {30, 1.0}
        };
    }

    @DataProvider(name = "Tg Negative Data Provider")
    public Object [][] tgNegativeDataProvider() {
        return new Object[][] {
                {60,0},
                {30, 0}
        };
    }

    @DataProvider(name = "Ctg Positive Data Provider")
    public Object [][] ctgPositiveDataProvider() {
        return new Object[][] {
                {60, 1.0},
                {30, 1.0}
        };
    }

    @DataProvider(name = "Ctg Negative Data Provider")
    public Object [][] ctgNegativeDataProvider() {
        return new Object[][] {
                {60,0},
                {30, 0}
        };
    }

    @DataProvider(name = "Cos Positive Data Provider")
    public Object [][] cosPositiveDataProvider() {
        return new Object[][] {
                {60,0.5},
                {90, 0}
        };
    }

    @DataProvider(name = "Cos Negative Data Provider")
    public Object [][] cosNegativeDataProvider() {
        return new Object[][] {
                {60,0},
                {30, 0}
        };
    }

    @DataProvider(name = "Sin Positive Data Provider")
    public Object [][] sinPositiveDataProvider() {
        return new Object[][] {
                {30,0.5},
                {60, 0.87}
        };
    }

    @DataProvider(name = "Sin Negative Data Provider")
    public Object [][] sinNegativeDataProvider() {
        return new Object[][] {
                {60,0},
                {30, 0}
        };
    }
}
