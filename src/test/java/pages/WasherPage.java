package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WasherPage extends AnyPage {

    @FindBy(xpath = "//div[contains(.,'Минимальная цена, грн:')]/../div[@class='is_empty_items']/a[contains(.,'6000')]")
    public WebElement minPrice;

    @FindBy(xpath = "//div[contains(.,'Максимальная цена, грн:')]/../div[@class='is_empty_items']/a[contains(.,'9000')]")
    public WebElement maxPrice;

    @FindBy(xpath = "//li[@class='pager-last last']")
    public WebElement lastPage;

}
