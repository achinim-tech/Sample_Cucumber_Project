package SeleniumTest.PageObjects;

import SeleniumTest.Common.BaseClass;
import SeleniumTest.Common.PropertyFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class FirstPage extends BaseClass {

    WebDriver driver;

//    @FindBy(id="userEmail")
//    WebElement userEmail;
//
//    @FindBy(css="[class*='flyInOut']")
//    WebElement errorMessage;

      By test = By.id("login");
      By test2=By.xpath("//*[@id='login']");
      By test3=By.cssSelector("input#login1");

    public FirstPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void goTo() throws IOException {

        PropertyFileReader propertyFileReader=new PropertyFileReader();
        String url=propertyFileReader.getPropertyValue("url");

        driver.get(url);
    }



}
