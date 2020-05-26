package calculator.pageobjects;

import calculator.common.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CalculatorPage {
    WebDriver driver;
    By Result = By.cssSelector("div.dcg-exp-output-container .dcg-mq-root-block");

    public CalculatorPage()
    {
        this.driver = DriverManager.getDriver();
    }

    public void Open()
    {
        this.driver.get("https://www.desmos.com/scientific");
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void ClickOn(String number)
    {
        for (int i = 0; i < number.length(); i++) {
            char focusNumber = number.charAt(i);
            WebElement btnNumber = this.driver.findElement(
                    By.cssSelector("[dcg-command=\""+focusNumber+"\"]"));
            btnNumber.click();
        }
    }

    public String GetResult()
    {
        WebDriverWait waiter = new WebDriverWait(this.driver, 5);
        WebElement txtResult = waiter.until(ExpectedConditions.visibilityOf(this.driver.findElement(Result)));
        return txtResult.getText();
    }
}
