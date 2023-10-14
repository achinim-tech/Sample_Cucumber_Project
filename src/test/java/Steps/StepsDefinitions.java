package Steps;


import BaseTestComponents.TestBase;
import SeleniumTest.PageObjects.FirstPage;
import SeleniumTest.PageObjects.HomePage;
import SeleniumTest.PageObjects.LandingPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StepsDefinitions extends TestBase {


    public LandingPage landingPage;
    public HomePage homePage;

    @Given("I navigate to the application")
    public void i_navigate_to_the_application() throws IOException {
        landingPage=launchApplication();

    }


    @After
    public void tearDown()
    {
        System.out.println("BBB");
        driver.close();
    }

    @Given("Login with username {string} and password {string}")
    public void loginWithUsernameAndPassword(String username, String password) {
        homePage=landingPage.Login(username,password);
//        driver.findElement(By.xpath("//*[@id='User_user_name']")).sendKeys("Achini10");
//        driver.findElement(By.cssSelector("#User_user_password")).sendKeys("Swivel@123");
//        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
    }

    @And("I navigate to HomePage")
    public void iNavigateToHomePage() {
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img.logo-size-60")));
//        String HomeTitle=driver.getTitle();
//        System.out.println("Home Title is: "+HomeTitle);
        String HomeTitle=homePage.VerifyHomePage();
        Assert.assertTrue(HomeTitle.equalsIgnoreCase("Human Resource Information system - Site"));
    }

    @When("I click on attendance")
    public void iClickOnAttendance() {

        homePage.ClickAttendance();
    }

    @Then("{string} message is displayed")
    public void messageIsDisplayed(String string) {

      // String sucessMessage= homePage.VerifySucessMessage();
      //  Assert.assertTrue(sucessMessage.equalsIgnoreCase(string));
        driver.findElement(By.cssSelector("a[title='View Marked Attendance History']")).click();
        List<WebElement> records=driver.findElements(By.xpath("//*[contains(text(),'12 Oct 2023')]"));

        Collections.reverse(records);
        Optional <WebElement> optionalLastWebElement  = records.stream().findFirst();
        
        System.out.println("test"+optionalLastWebElement);


    }
}
