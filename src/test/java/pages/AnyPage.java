package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnyPage {

    @FindBy(xpath = "//div[@class='price']/strong")
    public List<WebElement> allprices;

}
