package homework6.tests;

import org.testng.annotations.Test;

public class ExersizeTest extends BaseTest {

    @Test
    public void exersizeTest() {

        actionSteps.login();
        assertionSteps.assertLogin();
        actionSteps.createLetter();
        actionSteps.saveLetter();
        assertionSteps.assertElementsOfLetter();
        actionSteps.logout();

    }
}
