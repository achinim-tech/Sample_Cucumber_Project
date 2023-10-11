package Steps;


import BaseTestComponents.TestBase;
import SeleniumTest.PageObjects.FirstPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class StepsDefinitions extends TestBase {

    public FirstPage firstPage;

    @Given("I navigate to the application")
    public void i_navigate_to_the_application() throws IOException {
        firstPage=launchApplication();

    }


    @After
    public void tearDown()
    {
        System.out.println("BBB");
        driver.close();
    }

    @Given("Login with username {string} and password {string}")
    public void loginWithUsernameAndPassword(String username, String password) {
        System.out.println("ABC");
    }
}
