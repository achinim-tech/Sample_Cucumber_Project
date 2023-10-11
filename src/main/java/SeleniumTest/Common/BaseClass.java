package SeleniumTest.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseClass {

    WebDriver driver;

    public BaseClass(WebDriver driver) {
        this.driver=driver;
    }

    public void waitForElementToAppear(By findBy)  {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));



    }
}
