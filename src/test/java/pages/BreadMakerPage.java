package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BreadMakerPage extends AnyPage {

    @FindBy(xpath = "//div[@class='is_empty_items']/a[contains(.,'Saturn')]")
    public WebElement producerSaturn;

    @FindBy(xpath = "//div[@class='name']/a")
    public List<WebElement> allProducerSaturnOnPage;

    @FindBy(xpath = "//div[@class='is_empty_items']/a[contains(.,'Регулировка веса')]")
    public WebElement controlWeight;

    @FindBy(xpath = "//div[@class='item']/div[@class='description']")
    public List<WebElement> allProductWithControlWeight;

}
