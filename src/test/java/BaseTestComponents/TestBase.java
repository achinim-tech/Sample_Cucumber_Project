package BaseTestComponents;

import SeleniumTest.Common.PropertyFileReader;
import SeleniumTest.PageObjects.FirstPage;
import SeleniumTest.PageObjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase

{
       public WebDriver driver;
       public LandingPage landingPage;

       public WebDriver initializeDriver() throws IOException {


              PropertyFileReader propertyFileReader=new PropertyFileReader();
              String browserName=propertyFileReader.getPropertyValue("browser");



              if (browserName.equalsIgnoreCase("chrome"))
              {
                     WebDriverManager.chromedriver().setup();
                     driver= new ChromeDriver();

              } else if (browserName.equalsIgnoreCase("firefox")) {

                     WebDriverManager.firefoxdriver().setup();
                     driver=new FirefoxDriver();
              }

              else if (browserName.equalsIgnoreCase("edge")) {
                     WebDriverManager.edgedriver().setup();
                     driver = new EdgeDriver();

              }

              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
              driver.manage().window().maximize();
              return driver;
       }


       public LandingPage launchApplication() throws IOException {
              driver = initializeDriver();
              landingPage = new LandingPage(driver);
              landingPage.goTo();
              return landingPage;
       }
}
