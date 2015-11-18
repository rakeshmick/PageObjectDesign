import HelpersPackage.BasePage;
import com.google.common.base.Function;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.LoadableComponent;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/**
 * Created by rakeshprabhakaran on 24/10/2015.
 */
public class LandingPageWithDownloadable extends BasePage{



    @FindBy(css=".globalHeader-topPanel-wappleFull.u-noOutline")
    WebElement globalHeaderTopPanel;

    @FindBy(css=".globalHeader-navigationItems")
    WebElement navigationHeader;


    LandingPageWithDownloadable(WebDriver driver) {
        super(driver);
    }
}
