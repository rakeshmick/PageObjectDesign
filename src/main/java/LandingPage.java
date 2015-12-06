import HelpersPackage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by rakeshprabhakaran on 24/10/2015.
 */
public class LandingPage extends BasePage{

    LandingPage landingPage;

    @FindBy(css=".globalHeader-topPanel-wappleFull.u-noOutline")
    WebElement globalHeaderTopPanel;

    @FindBy(css=".globalHeader-navigationItems")
    WebElement navigationHeader;




    LandingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), LandingPage.class);

    }

    public LandingPage landingPageObj(){
         PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), LandingPage.class);
       return  this;
    }
}
