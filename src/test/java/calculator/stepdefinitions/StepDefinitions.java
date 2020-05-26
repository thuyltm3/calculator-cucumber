package calculator.stepdefinitions;

import calculator.pageobjects.CalculatorPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.*;

public class StepDefinitions {
    CalculatorPage calPage;
    public StepDefinitions()
    {
        this.calPage = new CalculatorPage();
    }
    @Given("^The calculator is showed$")
    public void the_calculator_is_showed() throws Throwable {
        this.calPage.Open();
    }

    @When("^The user attempt to execute (.+) between (.+) and (.+)$")
    public void the_user_attempt_to_execute_between_and(String operator, String number1, String number2) throws Throwable {
        this.calPage.ClickOn(number1);
        this.calPage.ClickOn(operator);
        this.calPage.ClickOn(number2);
    }

    @Then("^The corresponding (.+) is showed$")
    public void the_corresponding_is_showed(String result) throws Throwable {
        Assert.assertEquals("="+ result, this.calPage.GetResult());
    }
}
