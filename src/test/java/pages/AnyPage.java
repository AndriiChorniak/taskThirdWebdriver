package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnyPage {

    @FindBy(xpath = "//div[@class='price']/strong")
    public List<WebElement> allprices;
    
    @FindBy(xpath = "//div[@class='order']/a[contains(.,'цена')]")
    public WebElement buttonSortByPrice;

}
