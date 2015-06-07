package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BreadMakerPage extends AnyPage {

    @FindBy(xpath = "//a[@href='http://pn.com.ua/ct/2138/?fo=925']")
    public WebElement producerSaturn;

    @FindBy(xpath = "//div[@class='name']/a")
    public List<WebElement> allProducerSaturnOnPage;

    @FindBy(xpath = "//a[@href='http://pn.com.ua/ct/2138/?fo=925&ff=882']")
    public WebElement controlWeight;

    @FindBy(xpath = "//div[@class='item']/div[@class='description']")
    public List<WebElement> allProductWithControlWeight;

}
