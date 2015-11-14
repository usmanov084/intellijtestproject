package testPackage;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by hasan on 07/11/2015.
 */
public class firstBrowserTest {

    @Test
    public void testHomePage() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.bbc.co.uk");
        System.out.println(driver.getTitle());
    }
}
