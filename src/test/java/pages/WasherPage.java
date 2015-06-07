package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WasherPage extends AnyPage {

    @FindBy(xpath = "//a[@href='http://pn.com.ua/ct/2161/?fp1=6000']")
    public WebElement minPrice;

    @FindBy(xpath = "//a[@href='http://pn.com.ua/ct/2161/?fp1=6000&sort=price']")
    public WebElement buttonSortByPrice;

    @FindBy(xpath = "//a[@href='http://pn.com.ua/ct/2161/?fp1=6000&fp2=9000&sort=price']")
    public WebElement maxPrice;

    @FindBy(xpath = "//a[@href='http://pn.com.ua/ct/2161/?page=16&fp1=6000&fp2=9000&sort=price']")
    public WebElement lastPage;

}
