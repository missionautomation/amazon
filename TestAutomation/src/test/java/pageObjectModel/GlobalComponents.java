package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlobalComponents {
	
	@FindBy(id="nav-logo")
	public WebElement uiGlobal_AmazonLogo;
	
	@FindBy(id="searchDropdownBox")
	public WebElement allSearchDropDown;
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement searchTextBox;
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement searchIcon;
	
	@FindBy(id="nav-cart")
	public WebElement cartIcon;
	
	@FindBy(id="nav-cart-count")
	public WebElement cartItemNumber;
	
	@FindBy(id="nav-link-wishlist")
	public WebElement yourListsOption;
	
	@FindBy(id="nav-link-prime")
	public WebElement tryPrimeOption;
	
	@FindBy(id="nav-link-yourAccount")
	public WebElement yourAccountOptions;
	
	
}
