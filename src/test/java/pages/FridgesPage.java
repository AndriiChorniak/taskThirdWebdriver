package pages;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FridgesPage extends AnyPage{
	
	@FindBy(xpath = "//div[@class='order']/a[contains(.,'название')]")
	public WebElement buttonName;
	
	@FindBy(xpath = "//div[@class='name']/a")
	public List<WebElement> allNames;


}
