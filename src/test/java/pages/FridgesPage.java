package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FridgesPage extends AnyPage{
	
	
	
	@FindBy(xpath = "//a[@href='http://pn.com.ua/ct/2163/?sort=price']")
	public WebElement buttonPrice;
	
	
	
	


}
