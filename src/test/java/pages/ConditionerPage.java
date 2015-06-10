package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConditionerPage extends AnyPage {

    @FindBy(xpath = "//a[@href='http://pn.com.ua/md/405140/']")
    public WebElement linkFirstConditioner;

    @FindBy(xpath = "//a[@href='http://pn.com.ua/md/405137/']")
    public WebElement linkSecondConditioner;

    @FindBy(xpath = "//a[@href='http://pn.com.ua/md/405133/']")
    public WebElement linkThirdConditioner;

    @FindBy(xpath = "//a[@href='http://pn.com.ua/md/405130/']")
    public WebElement linkFourthConditioner;

    @FindBy(xpath = "//a[@href='http://pn.com.ua/md/458627/']")
    public WebElement linkFifthConditioner;

    @FindBy(xpath = "//div[@class='row']/span[@class='val']")
    public List<WebElement> allValueOfCharacteristics;

    @FindBy(xpath = "//div[@class='link']/a[contains(.,'прайсы')]")
    public WebElement linkPraicy;

}
