package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    @FindBy(xpath = "//a[@href='http://pn.com.ua/']")
    public WebElement linkToMainPage;

    @FindBy(xpath = "//a[contains(.,'Стиральные машины')]")
    public WebElement buttonWashers;

    @FindBy(xpath = "//a[contains(.,'Микроволновки')]")
    public WebElement buttonMicrowaves;

    @FindBy(xpath = "//a[contains(.,'Холодильники')]")
    public WebElement buttonFridges;

    @FindBy(xpath = "//a[contains(.,'Хлебопечи')]")
    public WebElement buttonBreadMaker;

    @FindBy(xpath = "//a[contains(.,'Кондиционеры')]")
    public WebElement buttonConditioner;
    @FindBy(xpath = "//a[contains(.,'Бытовая техника')]")  
    public WebElement buttonDomesticEquipment;
}
