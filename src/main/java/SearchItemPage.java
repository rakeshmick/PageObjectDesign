import HelpersPackage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Clock;
import org.openqa.selenium.support.ui.SystemClock;


/**
 * Created by rakeshprabhakaran on 14/11/2015.
 */
public class SearchItemPage extends BasePage {


    @FindBy(css=".globalHeader-searchContainer.globalHeader-searchContainer--overlay .globalHeader-searchAutocompleteContainer .olyAutocomplete-inputContainer #globalHeaderSearch")
    WebElement searchItemField;

    @FindBy(css=".globalHeader-searchButton.globalHeader-showSearchButton.button.button--primary .icon-search.globalHeader-searchHeaderIcon")
    WebElement searchIcon;

    public SearchItemPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),SearchItemPage.class);
    }


    public void searchAnItem(){


      Clock clock= new SystemClock();

        searchIcon.click();
        searchItemField.sendKeys("Orange");

    }
}
