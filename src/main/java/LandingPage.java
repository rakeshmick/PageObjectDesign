import HelpersPackage.BasePage;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import java.util.NoSuchElementException;

/**
 * Created by rakeshprabhakaran on 24/10/2015.
 */
public class LandingPage extends BasePage{



    @FindBy(css=".globalHeader-topPanel-wappleFull.u-noOutline")
    WebElement globalHeaderTopPanel;

    @FindBy(css=".globalHeader-navigationItems")
    WebElement navigationHeader;


    //Clock clock=new org.openqa.selenium.support.ui.SystemClock();


    LandingPage(WebDriver driver)
    {
        super(driver);

    }
}
