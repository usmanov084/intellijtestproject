package testPackage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by hasan on 13/11/2015.
 */
public class findJourneyFare {

    @Test
    public void journeyFare()
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://tfl.gov.uk/fares-and-payments/fares/single-fare-finder");

        WebElement stationFrom = driver.findElement(By.id("From"));
        stationFrom.sendKeys("East Ham Underground Station");

        WebElement stationTo = driver.findElement(By.id("To"));
        stationTo.sendKeys("London Victoria");


        WebElement showSingleFare = driver.findElement(By.id("submit"));
        showSingleFare.click();

        WebElement fromDisambiguationBlock = driver.findElement(By.id("disambiguation-options"));

        if (fromDisambiguationBlock.isDisplayed()) {

        }

        //


    }



}
