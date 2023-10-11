package SeleniumTest.Common;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Properties;

public class PropertyFileReader {




    public   String getPropertyValue(String key) throws IOException {
        Properties prop =new Properties();

        FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/GlobalData.properties");

        prop.load(fis);
        String value =prop.getProperty(key);
        return value;
    }

}
