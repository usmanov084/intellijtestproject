package testPackage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by hasan on 13/11/2015.
 */
public class jobPortal {

    @Test
    public void jobPortalAutomation()
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www6.monster.co.uk");

        driver.findElement(By.id("loginLink")).click();
        driver.findElement(By.id("EmailAddress")).sendKeys("usm_070@hotmail.com");
        driver.findElement(By.id("Password")).sendKeys("abcd1234");
        //driver.findElement(By.id("signInContent")).click();
        driver.findElement(By.xpath("id('signInContent')/form/div[3]/input[1]")).click();

//        driver.get("http://my.monster.co.uk/?fwr=true&re=nv_gh_trnsi_%2FLogin%2FSignOut");
//
//
        //WebElement createCV=driver.findElement(By.className("btnstyleE"));
        //createCV.click();
        driver.get("http://my.monster.co.uk/Resume/CreateResume?landedFrom=Profile");
        driver.findElement(By.xpath("id('Title')")).clear();
        driver.findElement(By.xpath("id('Title')")).sendKeys("muhammad usman");
        driver.findElement(By.xpath("id('JobTitle')")).clear();
        driver.findElement(By.xpath("id('JobTitle')")).sendKeys("test analyst");
        driver.findElement(By.xpath("id('MakeSearchable')")).click();
        driver.get("http://my.monster.co.uk/Resume/EditContactInformation/9xxxfeb46hzubtpi");

        driver.findElement(By.xpath("id('Address')")).clear();
        driver.findElement(By.xpath("id('Address')")).sendKeys("136 Neville Road");
        driver.findElement(By.xpath("id('UserEnteredZipName')")).clear();
        driver.findElement(By.xpath("id('UserEnteredZipName')")).sendKeys("E79QT");
        driver.findElement(By.xpath("id('MobileNumber')")).clear();
        driver.findElement(By.xpath("id('MobileNumber')")).sendKeys("7735311420");


        driver.get("http://my.monster.co.uk/Resume/EditContactInformation/9xxxfeb46hzubtpi");

        driver.get("http://my.monster.co.uk/Resume/EditSummary/9xxxfeb46hzubtpi");
        driver.findElement(By.id("SummaryContent")).clear();
        driver.findElement(By.id("SummaryContent")).sendKeys(" Experienced in Functional Testing, Web Development with strong domain knowledge in Automobiles and Construction Industry and cleared CRB Clearance Certification.");
        driver.findElement(By.id("CareerHighlightContent")).clear();
        driver.findElement(By.id("CareerHighlightContent")).sendKeys(" Test execution using Selenium Web Driver and Database testing using SQL Server and Oracle");

        driver.get("http://my.monster.co.uk/Resume/EditEducation/9xxxfeb46hzubtpi");

        driver.findElement(By.xpath("id('DegreeLevel')")).click();
        driver.findElement(By.xpath("id('DegreeLevel')/option[7]")).click();
        driver.findElement(By.xpath("id('DegreeLevel')/option[7]")).sendKeys("Master's Degree");
        driver.findElement(By.xpath("id('School')")).sendKeys("Coventry University");

        driver.findElement(By.xpath("id('Concentrations_0__Name')")).sendKeys("s/w dev, s/w eng, db dev, in apps");

        driver.findElement(By.xpath("id('CountryId')/option[230]")).sendKeys("UK");

        driver.findElement(By.xpath("id('Location')")).sendKeys("Coventry");

        driver.findElement(By.xpath("id('form0')/div/fieldset/input[1]")).click();

        driver.get("http://my.monster.co.uk/Resume/EditCertificate/9xxxfeb46hzubtpi");
        driver.findElement(By.id("Name")).sendKeys("ISTQB");
        driver.findElement(By.id("Institucion")).sendKeys("British Computer Society");
        driver.findElement(By.xpath("id('Month')")).click();
        driver.findElement(By.xpath("id('Month')/option[9]")).click();
        driver.findElement(By.xpath("id('Month')/option[9]")).sendKeys("August");
        driver.findElement(By.xpath("id('Year')")).click();
        driver.findElement(By.xpath("id('Year')/option[2]")).click();
        driver.findElement(By.xpath("id('Year')/option[2]")).sendKeys("2015");

        driver.findElement(By.xpath("id('form0')/div/fieldset/input[1]")).click();


        driver.get("http://my.monster.co.uk/Resume/SkillLanguageList/9xxxfeb46hzubtpi");

        driver.findElement(By.xpath("id('form0')/div[1]/a")).click();
        driver.get("http://my.monster.co.uk/Resume/EditSkill/9xxxfeb46hzubtpi");
        driver.findElement(By.id("Name")).sendKeys("Selenium Web Driver");
        driver.findElement(By.xpath("id('LevelId')")).click();
        driver.findElement(By.id("LevelId")).click();
        driver.findElement(By.id("LevelId")).sendKeys("Beginner");

        driver.findElement(By.xpath("id('form0')/div/fieldset[2]/input")).click();
        driver.get("http://my.monster.co.uk/Resume/SkillLanguageList/2cvmgpkd8px3spcb");
        driver.findElement(By.xpath("id('form0')/div[2]/a")).click();
        driver.findElement(By.xpath("id('LanguageId')")).click();
        driver.findElement(By.xpath("id('LanguageId')/option[54]")).click();
        driver.findElement(By.xpath("id('LanguageId')/option[54]")).sendKeys("English");

        driver.findElement(By.xpath("id('ProficiencyId')")).click();
        driver.findElement(By.xpath("id('ProficiencyId')/option[4]")).click();
        driver.findElement(By.xpath("id('ProficiencyId')/option[4]")).sendKeys("Advanced");
        driver.findElement(By.xpath("id('form0')/div/fieldset[2]/input")).click();

        driver.get("http://my.monster.co.uk/Resume/EditAwardsAndMemberships/9xxxfeb46hzubtpi");
        driver.findElement(By.xpath("id('Memberships_Items_0__Content')")).clear();
        driver.findElement(By.xpath("id('Memberships_Items_0__Content')")).sendKeys("LinkedIn");
        driver.findElement(By.xpath("id('Awards_Items_0__Content')")).clear();
        driver.findElement(By.xpath("id('Awards_Items_0__Content')")).sendKeys("applied for award for my contributions in IT.");

        driver.findElement(By.xpath("id('form0')/div/fieldset[3]/input[1]")).click();


        driver.get("http://my.monster.co.uk/Resume/EditInterests/9xxxfeb46hzubtpi");
        driver.findElement(By.xpath("id('Interests_Items_0__Name')")).clear();
        driver.findElement(By.xpath("id('Interests_Items_0__Name')")).sendKeys("Research for my upcoming publications");

        driver.findElement(By.xpath("id('form0')/div/fieldset[2]/input[1]")).click();

        driver.get("http://my.monster.co.uk/Resume/EditReference/9xxxfeb46hzubtpi");
        driver.findElement(By.xpath("id('Name')")).clear();
        driver.findElement(By.xpath("id('Name')")).sendKeys("ini mini");
        driver.findElement(By.xpath("id('Phone')")).clear();
        driver.findElement(By.xpath("id('Phone')")).sendKeys("7735311421");
        driver.findElement(By.xpath("id('TypeId0')")).click();
        driver.findElement(By.xpath("id('form0')/div/fieldset[3]/input[1]")).click();







    }
}
