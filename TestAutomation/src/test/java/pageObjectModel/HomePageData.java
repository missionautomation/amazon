package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageData {
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement searchTextBox;
	
	@FindBy(className="nav-input")
	public WebElement searchIcon;
	
	@FindBy(id="searchDropdownBox")
	public WebElement categorySearchDropDown;
	
	
}
