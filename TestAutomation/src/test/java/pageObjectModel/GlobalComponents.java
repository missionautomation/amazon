package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlobalComponents {
	
	@FindBy(id="nav-logo")
	public WebElement uiGlobal_AmazonLogo;

	@FindBy(id="searchDropdownBox")
	public WebElement uiGlobal_AllSearchDropDown;

	@FindBy(id="twotabsearchtextbox")
	public WebElement searchTextBox;

	@FindBy(id="twotabsearchtextbox")
	public WebElement uiGlobal_SearchIcon;
	
	@FindBy(id="nav-global-location-slot")
	public WebElement uiGlobal_DeliverTo;
	
	@FindBy(id="nav-link-shopall")
	public WebElement uiGlobal_ShopByCategory;

	@FindBy(id="nav-your-amazon")
	public WebElement uiGlobal_YourAmazon;
	
	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[2]")
	public WebElement uiGlobal_TodaysDeals;
	
	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[3]")
	public WebElement uiGlobal_AmazonPay;
	
	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[4]")
	public WebElement uiGlobal_Sell;
	
	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[5]")
	public WebElement uiGlobal_CustomerService;
	
	@FindBy(id="nav-link-yourAccount")
	public WebElement uiGlobal_SignInYourOrders;
	
	@FindBy(id="nav-link-prime")
	public WebElement uiGlobal_TryPrimeOption;
	
	@FindBy(id="nav-link-wishlist")
	public WebElement uiGlobal_YourListsOption;
	
	@FindBy(id="nav-cart")
	public WebElement uiGlobal_CartIcon;

	@FindBy(id="nav-cart-count")
	public WebElement uiGlobal_CartItemNumber;
	
}


