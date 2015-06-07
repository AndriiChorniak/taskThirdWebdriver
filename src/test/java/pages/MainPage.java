package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    @FindBy(xpath = "//a[@href='http://pn.com.ua/']")
    public WebElement linkToMainPage;

    @FindBy(xpath = "//a[@href='http://pn.com.ua/ct/2161/']")
    public WebElement buttonWashers;

    @FindBy(xpath = "//a[@href='http://pn.com.ua/ct/2137/']")
    public WebElement buttonMicrowaves;

    @FindBy(xpath = "//a[@href='http://pn.com.ua/ct/2163/']")
    public WebElement buttonFridges;

    @FindBy(xpath = "//a[@href='http://pn.com.ua/ct/2138/']")
    public WebElement buttonBreadMaker;

    @FindBy(xpath = "//a[@href='http://pn.com.ua/ct/2191/']")
    public WebElement buttonConditioner;

    @FindBy(xpath = "//a[@href='http://pn.com.ua/domestic-equipment/']")
    public WebElement buttonDomesticEquipment;
}
