package calculator.stepdefinitions;

import calculator.common.DriverManager;
import io.cucumber.java.After;
import org.junit.Before;

public class Hooks {
    @Before
    public void Before()
    {

    }

    @After
    public void After()
    {
        DriverManager.closeWebDriver();
    }
}
