package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MicrowavePage extends AnyPage {

    @FindBy(xpath = "//span[contains(.,'убрать')]")
    public WebElement delete;

    @FindBy(xpath = "//span[@pid='784029']")
    public WebElement buttonCompareFirstMicrowave;

    @FindBy(xpath = "//span[@pid='967037']")
    public WebElement buttonCompareSecondMicrowave;

    @FindBy(xpath = "//a[@href='/compare/2137']")
    public WebElement linkCompare;

    @FindBy(xpath = "//tbody/tr[8]/td[2]")
    public WebElement volumeFirst;

    @FindBy(xpath = "//tbody/tr[8]/td[3]")
    public WebElement volumeSecond;

    @FindBy(xpath = "//tbody/tr[9]/td[2]")
    public WebElement innerCoatingFirst;

    @FindBy(xpath = "//tbody/tr[9]/td[3]")
    public WebElement innerCoatingSecond;

    @FindBy(xpath = "//tbody/tr[10]/td[2]")
    public WebElement powerFirst;

    @FindBy(xpath = "//tbody/tr[10]/td[3]")
    public WebElement powerSecond;

    @FindBy(xpath = "//tbody/tr[14]/td[2]")
    public WebElement displayFirst;

    @FindBy(xpath = "//tbody/tr[15]/td[2]")
    public WebElement controlFirst;

    @FindBy(xpath = "//tbody/tr[15]/td[3]")
    public WebElement controlSecond;

    @FindBy(xpath = "//tbody/tr[16]/td[2]")
    public WebElement openningDoorFirst;

    @FindBy(xpath = "//tbody/tr[16]/td[3]")
    public WebElement openningDoorSecond;

    @FindBy(xpath = "//tbody/tr[17]/td[2]")
    public WebElement automatedFuncFirst;

    @FindBy(xpath = "//tbody/tr[17]/td[3]")
    public WebElement automatedFuncSecond;

    @FindBy(xpath = "//tbody/tr[18]/td[2]")
    public WebElement additionFirst;

    @FindBy(xpath = "//tbody/tr[20]/td[2]")
    public WebElement colourFirst;

    @FindBy(xpath = "//tbody/tr[20]/td[3]")
    public WebElement colourSecond;

    @FindBy(xpath = "//tbody/tr[21]/td[2]")
    public WebElement sizeFirst;

    @FindBy(xpath = "//tbody/tr[22]/td[2]")
    public WebElement weightFirst;

    static public By findButtonDelete() {
        return By.xpath("//span[contains(.,'убрать')]");
    }

}
