package HelpersPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by rakeshprabhakaran on 14/11/2015.
 */
public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver)
        {
            this.driver= driver;

            PageFactory.initElements(new AjaxElementLocatorFactory(this.driver, 20), this);
        }

}
