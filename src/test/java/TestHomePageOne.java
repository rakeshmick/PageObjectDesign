
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;



import HelpersPackage.ScreenShotTaker;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;


/**
 * Created by rakeshprabhakaran on 24/10/2015.
 */
public class TestHomePageOne {

    WebDriver driver;

    @Test
    public void LandingPageTest() {
        driver=new FirefoxDriver();
        driver.get("http://www.woolworths.com.au");
        LandingPageWithDownloadable lPage = new LandingPageWithDownloadable(driver);

        Assert.assertTrue(lPage.globalHeaderTopPanel.isDisplayed());
        System.out.println("title: ="+ driver.getTitle());
        SearchItemPage searchItemPage = new SearchItemPage(driver);
        searchItemPage.searchAnItem();
        ScreenShotTaker screenshotTaker= new ScreenShotTaker();
        screenshotTaker.takeScreenshot(driver,"screenshot");
        assertTrue(screenshotTaker.takeScreenshot(driver,"screenshotTwo").delete());
    }




    @AfterClass
    public void afterMethod(){
        driver.close();
        driver.quit();
    }



}
